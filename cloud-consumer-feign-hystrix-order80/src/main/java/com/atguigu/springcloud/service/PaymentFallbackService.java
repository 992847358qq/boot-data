package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/5/30 8:57
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "系统繁忙，请稍后再试：  "+id;
    }
}

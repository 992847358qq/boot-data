package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/5/27 23:24
 **/
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_OK,id："+id;
    }
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
            try {
                TimeUnit.SECONDS.sleep(timeNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_TimeOut,id："+id+"  耗时(秒)："+timeNumber;
    }
}

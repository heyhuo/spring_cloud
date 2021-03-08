package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author heyhuo
 * @create 2021-03-07
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---PaymentFallbackService fall back-paymentInfo_OK  o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---PaymentFallbackService fall back-paymentInfo_TimeOut  o(╥﹏╥)o";
    }
}

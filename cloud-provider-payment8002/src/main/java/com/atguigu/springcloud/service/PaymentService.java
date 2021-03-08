package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author heyhuo
 * @create 2021-03-05
 */
public interface PaymentService {
     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);


}

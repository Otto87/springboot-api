package com.example.demo.Features.Order;
import com.example.demo.model.Message;
import com.example.demo.model.Order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Post {

    @PostMapping("api/order")
    public Message handle(@RequestBody Order order) {
        return new Message("Order placed: ");
    }
}
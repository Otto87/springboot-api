package com.example.demo.Features.Order;
import com.example.demo.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Get {

    @GetMapping("api/orders/{id}")
    public Message handle(@PathVariable int id) {
        return new Message("Order fetched: " + id);
    }
}
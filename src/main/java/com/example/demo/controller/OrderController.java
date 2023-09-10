package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.utils.JwtUtils;
import com.example.demo.utils.Result;
import com.example.demo.utils.Result;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    //@RequestBody要求前端传来json格式
    @PostMapping("/order")
    public Result login(@RequestBody Order order){
        String token = JwtUtils.generateToken(order.getId());
        return Result.ok().data("token",token);
    }
    @GetMapping("/info")
    public Result info(String token){
        String username = JwtUtils.getClaimsByToken(token).getSubject();
        return Result.ok().data("name",username);
    }

    @PostMapping("/logout")
    public Result logout(){
        return Result.ok();
    }


}

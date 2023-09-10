package com.example.demo.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController1 {
    @Autowired
    private OrderMapper orderMapper;


//    @GetMapping("/order")
//    public String query(){
//        return "查询用户";
//    }

    //查询
//    @GetMapping("/order")
//    public List query(){
////    public String find(){
//      List<Order> list = orderMapper.find();
//        System.out.println(list);
//        return list;
//    }

    @GetMapping("/order")
    public List query(){
//    public String find(){
        List<Order> list = orderMapper.selectList(null);
        System.out.println(list);
        return list;
    }

    @GetMapping("/order/find")
    public List<Order> findByCond(){
        QueryWrapper<Order> queryWrapper = new QueryWrapper();
        queryWrapper.eq("order_id","2023-09-29");
        return orderMapper.selectList(queryWrapper);
    }

    @PostMapping("/order")
    public String save(Order order){
        int i = orderMapper.insert(order);
        if(i>0){
            return "insert succ";
        }else{
            return "insert fail";
        }
    }

    //分页查询
    @GetMapping("/order/findByPage")
    public IPage findByPage(){
        Page<Order> page = new Page<>(0,2);
        IPage iPage = orderMapper.selectPage(page,null);
        return iPage;
    }

    //mybatisplus分页
//    @GetMapping("findAll")
//    public IPage findAll(){
//        Page<Order> page = new Page<>(0,2);
//        return orderMapper.selectPage(page,null);
//
//    }



//    public Order getOrderById(@PathVariable int orderId) {
//        return orderMapper.getOrderById(orderId);
//    }
//
//    @PostMapping
//    public Order createOrder(@RequestBody Order order) {
//        return orderMapper.createOrder(order);
//    }
//
//    @PutMapping("/{orderId}")
//    public Order updateOrder(@PathVariable int orderId, @RequestBody Order order) {
//        return orderMapper.updateOrder(orderId, order);
//    }
//
//    @DeleteMapping("/{orderId}")
//    public void deleteOrder(@PathVariable int orderId) {
//        orderMapper.deleteOrder(orderId);
//    }


}

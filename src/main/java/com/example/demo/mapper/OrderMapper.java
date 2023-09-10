package com.example.demo.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Order;

import org.apache.ibatis.annotations.*;

import java.util.List;

//BaseMapper<Order>里的类要和表保持一致？
@Mapper
public interface OrderMapper extends BaseMapper<Order> {


//    Order getOrderById(int orderId);
//
//
//    Order createOrder(Order order);
//
//    Order updateOr der(int orderId, Order order);
//
//    void deleteOrder(int orderId);
//
//    @Select("select * from t_user where id=#{id}")
//    Order selectByVxId(int id);
//    //查询用户及其所用订单
//    @Select("select * from t_user")
//    @Results({
//            @Result(column = "id",property = "id"),
//            @Result(column = "username",property = "username" ),
//            @Result(column = "password",property = "password"),
//            @Result(column = "birthday",property = "birthday"),
//            @Result(column = "id",property = "orders", javaType = Order.class,
//                    one=@One(select = "com.example.demo.mapper.OrderMapper.selectByVxId"))
//
//    }
//
//    )


//    @Insert("insert into order values(#{},#{},#{},#{},#{},#{})")
//    int add(Order order);
//
//    @Update("update order set ")
//    int update(Order order);
//
//    @Delete("delete from order where ")


//    @Select("select * from t_order")
//    List<Order> find();
//
//    //int代表插入了几条记录
//    @Insert("insert into t_order values(#{id},#{buyerid},#{sellerid},#{orderid},#{orderdate},#{ddldate},#{amount},#{ispaid},#{comment},#{issettled})")
//    public int insert(Order order);


//    @Insert("insert into t_order values(#{},#{},#{},#{},#{},#{})")
//    int add(Order order);





}

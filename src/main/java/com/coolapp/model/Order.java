package com.coolapp.model;

import com.coolapp.control.ProductDeliverProcess;

import java.util.Date;

public class Order extends ProductModel{
    private String orderId;
    private Date orderDate;
    private ProductDeliverProcess.OrderStatus orderStatus;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public ProductDeliverProcess.OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(ProductDeliverProcess.OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order(){
        orderId = "";
        orderDate = new Date();
        orderStatus = ProductDeliverProcess.OrderStatus.NONE;
    }

}

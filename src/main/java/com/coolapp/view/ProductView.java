package com.coolapp.view;

import com.coolapp.control.ProductDeliverProcess;
import com.coolapp.dao.ProductRepository;
import com.coolapp.model.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductView {
    public static void main(String[] args) throws ParseException {

        Order order1 = new Order();
        order1.setName("Hamburg X");
        order1.setPrice(9.99);
        order1.setQuantity(2);
        order1.setOrderStatus(ProductDeliverProcess.OrderStatus.NONE);
        order1.setOrderId("1011203");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date dateOrder = sdf.parse("05-12-2024 14:22:03");
        order1.setOrderDate(dateOrder);

        ProductRepository productRepository = new ProductRepository();
        productRepository.adicionarProduto(order1);
        productRepository.listarTabelDePrecos();
        productRepository.listarProdutosEmProcessamento();
        order1.setOrderStatus(ProductDeliverProcess.OrderStatus.PROCESSING);
        productRepository.listarProdutosEmProcessamento();
    }
}

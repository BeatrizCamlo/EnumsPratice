package com.coolapp.control;

import com.coolapp.model.Order;

public class ProductDeliverProcess {
    private Order order;

    public enum OrderStatus {
        NONE,
        PENDING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED;
    }

    public void changeStatusForPending(Order order) {
        System.out.println("O PRODUTO PRECISA ESTÁ COM O PAGAMENTO PENDENTE");
        order.setOrderStatus(OrderStatus.PENDING_PAYMENT);
    }
    public void changeStatusForProcessing(Order order) {
        System.out.println("O PRODUTO PRECISA ESTÁ EM PROCESSAMENTO");
        order.setOrderStatus(OrderStatus.PROCESSING);
    }
    public void changeStatusShipped(Order order) {
        System.out.println("O PRODUTO PRECISA FOI ENVIADO");
        order.setOrderStatus(OrderStatus.SHIPPED);
    }
    public void changeStatusDelivered(Order order) {
        System.out.println("O PRODUTO PRECISA FOI ENTREGUE");
        order.setOrderStatus(OrderStatus.DELIVERED);
    }

}

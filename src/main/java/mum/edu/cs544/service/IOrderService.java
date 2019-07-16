package mum.edu.cs544.service;

import mum.edu.cs544.domain.Order;

import java.util.List;

public interface IOrderService {
    public void setOrder(Order order);
    public void modifyOrder(Order order);
    public Order viewOrder(long id);
    public List<Order> fiddAll();
    public Order findOne(long orderId);
    public void deleteOrder(long orderId);
}

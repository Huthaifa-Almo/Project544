package mum.edu.cs544.service;

import mum.edu.cs544.domain.Order;

public interface IOrderService {
    public void setOrder(Order order);
    public void modifyOrder(Order order);
    public Order viewOrder(long id);
}

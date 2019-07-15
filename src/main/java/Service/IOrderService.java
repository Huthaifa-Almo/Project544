package Service;

import Domain.Order;

public interface IOrderService {
    public void setOrder(Order order);
    public void modifyOrder(Order order);
    public Order viewOrder(long id);
}

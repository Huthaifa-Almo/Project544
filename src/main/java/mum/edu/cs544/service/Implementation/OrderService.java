package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.IOrderDAO;
import mum.edu.cs544.dao.Implementation.OrderDAO;
import mum.edu.cs544.domain.Order;
import mum.edu.cs544.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService implements IOrderService {
    @Autowired
    private IOrderDAO orderDAO;

    @Override
    public void setOrder(Order order) {
        orderDAO.save(order);
    }

    @Override
    public void modifyOrder(Order order) {
    orderDAO.update(order);
    }

    @Override
    public Order viewOrder(long id) {

        return orderDAO.findOne(id);
    }

    @Override
    public List<Order> fiddAll() {
        return orderDAO.findAll();
    }

    @Override
    public Order findOne(long orderId) {
        return orderDAO.findOne(orderId);
    }

    @Override
    public void deleteOrder(long orderId) {
        orderDAO.delete(orderId);
    }
}

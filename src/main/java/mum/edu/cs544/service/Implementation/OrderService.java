package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.Implementation.OrderDAO;
import mum.edu.cs544.domain.Order;
import mum.edu.cs544.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService implements IOrderService {
    @Autowired
    private OrderDAO orderDAO;

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
}

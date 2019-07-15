package Service.Implementation;

import DAO.Implementation.OrderDAO;
import Domain.Order;
import Service.IOrderService;
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

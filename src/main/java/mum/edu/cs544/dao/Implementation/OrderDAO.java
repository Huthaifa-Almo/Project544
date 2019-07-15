package mum.edu.cs544.dao.Implementation;

import mum.edu.cs544.dao.IOrderDAO;
import mum.edu.cs544.domain.Order;

public class OrderDAO extends GenericDAO<Order> implements IOrderDAO {
    public OrderDAO() {
        super.setDaoClass(Order.class );
    }
}

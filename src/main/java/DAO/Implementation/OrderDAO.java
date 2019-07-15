package DAO.Implementation;

import DAO.IOrderDAO;
import Domain.Order;

public class OrderDAO extends GenericDAO<Order> implements IOrderDAO {
    public OrderDAO() {
        super.setDaoClass(Order.class );
    }
}

package DAO.Implementation;

import DAO.IFoodDAO;
import Domain.Food;

public class FoodDAO extends GenericDAO<Food> implements IFoodDAO {
    public FoodDAO() {
        super.setDaoClass(Food.class );
    }
}

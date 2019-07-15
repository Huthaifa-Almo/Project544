package mum.edu.cs544.dao.Implementation;

import mum.edu.cs544.dao.IFoodDAO;
import mum.edu.cs544.domain.Food;
import org.springframework.stereotype.Repository;

@Repository
public class FoodDAO extends GenericDAO<Food> implements IFoodDAO {
    public FoodDAO() {
        super.setDaoClass(Food.class );
    }
}

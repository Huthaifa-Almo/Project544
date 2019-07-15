package Service.Implementation;

import DAO.Implementation.FoodDAO;
import Domain.Food;
import Service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FoodService implements IFoodService {
    @Autowired
    private FoodDAO foodDAO;
    @Override
    public void addFood(Food food) {
        foodDAO.save(food);
    }
}

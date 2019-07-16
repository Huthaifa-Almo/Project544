package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.IFoodDAO;
import mum.edu.cs544.dao.Implementation.FoodDAO;
import mum.edu.cs544.domain.Food;
import mum.edu.cs544.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FoodService implements IFoodService {
    @Autowired
    private IFoodDAO foodDAO;
    @Override
    public void addFood(Food food) {
        foodDAO.save(food);
    }

    @Override
    public Food updateFood(Food food) {
        return foodDAO.update(food);
    }

    @Override
    public void deletFood(Long foodId) {
        foodDAO.delete(foodId);
    }

    @Override
    public List<Food> findAll() {
        return foodDAO.findAll();
    }

    @Override
    public Food findOne(Long foodId) {
        return foodDAO.findOne(foodId);
    }
}

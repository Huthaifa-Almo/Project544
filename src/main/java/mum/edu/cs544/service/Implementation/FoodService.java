package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.IFoodDAO;
import mum.edu.cs544.dao.Implementation.FoodDAO;
import mum.edu.cs544.domain.Food;
import mum.edu.cs544.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FoodService implements IFoodService {
    @Autowired
    private IFoodDAO foodDAO;
    @Override
    public void addFood(Food food) {
        foodDAO.save(food);
    }
}

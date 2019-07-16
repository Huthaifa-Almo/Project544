package mum.edu.cs544.service;

import mum.edu.cs544.domain.Food;

import java.util.List;

public interface IFoodService {
    public void addFood(Food food);
    public Food updateFood(Food food);
    public void deletFood(Long bookingId);
    public List <Food> findAll();
    public Food findOne(Long foodId);
}

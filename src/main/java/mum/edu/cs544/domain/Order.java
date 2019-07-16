package mum.edu.cs544.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    @OneToMany
    @JoinColumn(name="Food_Id")
    private List<Food> foodList;

    public Order(){

    }
}

package mum.edu.cs544.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    @OneToMany
    @JoinColumn(name="Food_Id")
    private List<Food> foodList;

    public Order(){

    }
}

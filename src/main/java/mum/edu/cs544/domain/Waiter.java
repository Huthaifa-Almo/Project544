package mum.edu.cs544.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Waiter")
public class Waiter extends Staff {

}

package mum.edu.cs544.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Chef")
public class Chef extends Staff {


}

package mum.edu.cs544.domain;

import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
public class ReservationManagment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        this.isPaid = paid;
    }

    private boolean isPaid;
    @ManyToOne
    private Booking booking;
    @ManyToOne
    private Staff staff;
}

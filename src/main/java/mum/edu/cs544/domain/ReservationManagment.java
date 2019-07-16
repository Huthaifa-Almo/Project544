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
    private boolean isPaid;
    @ManyToOne
    private Booking booking;
    @ManyToOne
    private Staff staff;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }


    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        this.isPaid = paid;
    }


}

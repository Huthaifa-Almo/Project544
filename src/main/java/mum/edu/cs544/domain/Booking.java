package mum.edu.cs544.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@SecondaryTable(name = "Customers")
public class Booking implements Serializable {
    public Booking() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @Temporal(TemporalType.DATE)
    private Date date;

    private String startTime;

    private String endTime;
    @Column(table = "Customers")
    private String customerName;
    @Column(table = "Customers")
    private String phoneNumber;
    @Column(table = "Customers")
    private String email;

    @OneToMany (mappedBy = "booking")
    private List<Table> reservedTables;
    @OneToMany(mappedBy = "booking")
    private List<ReservationManagment> reservationManagments;


    public List<ReservationManagment> getReservationManagments() {
        return reservationManagments;
    }

    public void setReservationManagments(List<ReservationManagment> reservationManagments) {
        this.reservationManagments = reservationManagments;
    }



    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Table> getReservedTables() {
        return reservedTables;
    }

    public void setReservedTables(List<Table> reservedTables) {
        this.reservedTables = reservedTables;
    }
}

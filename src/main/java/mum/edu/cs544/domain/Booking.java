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
    public Booking(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Temporal(TemporalType.TIME)
    private Date endTime;
    @Column(table = "Customers")
    private String customerName;
    @Column(table = "Customers")
    private String PhoneNumber;
    @Column(table = "Customers")
    private String email;
    @OneToMany
    private List<Table> reservedTables;
    @OneToMany(mappedBy = "booking")
    private List<ReservationManagment> reservationManagmentList;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
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

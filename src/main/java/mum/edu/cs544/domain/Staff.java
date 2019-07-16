package mum.edu.cs544.domain;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffId;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public List<ReservationManagment> getReservationManagmentList() {
        return reservationManagmentList;
    }

    public void setReservationManagmentList(List<ReservationManagment> reservationManagmentList) {
        this.reservationManagmentList = reservationManagmentList;
    }

    private String staffName;
    private String staffType;
    @OneToMany(mappedBy = "staff")
    private List<ReservationManagment> reservationManagmentList;

}

package mum.edu.cs544.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffId;
    private String staffName;
    private String staffType;
    @OneToMany(mappedBy = "staff")
    private List<ReservationManagment> reservationManagmentList;

}

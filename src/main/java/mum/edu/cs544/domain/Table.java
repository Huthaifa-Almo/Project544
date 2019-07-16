package mum.edu.cs544.domain;

import javax.persistence.*;

@Entity(name = "restTable")
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;
    private int numOfSeat;
    private boolean available;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

    public Table(){

    }
    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

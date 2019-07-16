package mum.edu.cs544.service;

import mum.edu.cs544.domain.Table;

import java.util.List;

public interface ITableService {
    public void setOccupied(Long id);
    public boolean getOccupied(Long id);
    public void addtable(Table table);
    public Table updateFood(Table table);
    public void delettable(Long tableId);
    public List<Table> findAll();
    public Table findOne(Long tableId);
}

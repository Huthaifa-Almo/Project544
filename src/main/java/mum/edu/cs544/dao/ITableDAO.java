package mum.edu.cs544.dao;

import mum.edu.cs544.domain.Table;

import java.util.ArrayList;
import java.util.List;

public interface ITableDAO extends GenericDAO<Table> {
    List<Table> findAllById(ArrayList<Long> tablesIds);
}

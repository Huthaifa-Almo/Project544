package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.ITableDAO;
import mum.edu.cs544.domain.Table;
import mum.edu.cs544.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TableService implements ITableService {
    @Autowired
    private ITableDAO tableDAO;

    @Override
    public void setOccupied(Long id) {
        tableDAO.findOne(id).setAvailable(false);
    }

    @Override
    public boolean getOccupied(Long id) {
        return tableDAO.findOne(id).isAvailable();
    }

    @Override
    public void addtable(Table table) {
        tableDAO.save(table);
    }

    @Override
    public Table updateFood(Table table) {
        return tableDAO.update(table);
    }

    @Override
    public void delettable(Long tableId) {
        tableDAO.delete(tableId);
    }

    @Override
    public List<Table> findAll() {
        return tableDAO.findAll();
    }

    @Override
    public List<Table> findAllById(List<Long> tablesIds) {
        return tableDAO.findAllById(tablesIds);
    }

    @Override
    public Table findOne(Long tableId) {
        return tableDAO.findOne(tableId);
    }

    @Override
    public List<Table> findAllByAvailability() {
        return tableDAO.findAllByAvailability();
    }

    @Override
    public void updateTableStatue(List<Table> tableList) {
        tableDAO.updateTableStatue(tableList);
    }
}

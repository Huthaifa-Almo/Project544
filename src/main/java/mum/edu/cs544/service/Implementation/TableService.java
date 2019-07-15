package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.Implementation.TableDAO;
import mum.edu.cs544.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TableService implements ITableService {
    @Autowired
    private TableDAO tableDAO;

    @Override
    public void setOccupied(Long id) {
        tableDAO.findOne(id).setAvailable(false);
    }

    @Override
    public boolean getOccupied(Long id) {
        return tableDAO.findOne(id).isAvailable();
    }
}

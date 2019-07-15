package mum.edu.cs544.dao.Implementation;

import mum.edu.cs544.dao.ITableDAO;
import mum.edu.cs544.domain.Table;
import org.springframework.stereotype.Repository;


@Repository
public class TableDAO extends GenericDAO<Table> implements ITableDAO {

    public TableDAO() {
        super.setDaoClass(Table.class );
    }

}

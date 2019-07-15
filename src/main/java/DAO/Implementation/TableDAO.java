package DAO.Implementation;

import DAO.ITableDAO;
import Domain.Table;

public class TableDAO extends GenericDAO<Table> implements ITableDAO {

    public TableDAO() {
        super.setDaoClass(Table.class );
    }

}

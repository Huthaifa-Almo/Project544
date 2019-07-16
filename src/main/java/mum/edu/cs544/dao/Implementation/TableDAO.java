package mum.edu.cs544.dao.Implementation;

import mum.edu.cs544.dao.ITableDAO;
import mum.edu.cs544.domain.Table;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;


@Repository
public class TableDAO extends GenericDAO<Table> implements ITableDAO {

    public TableDAO() {
        super.setDaoClass(Table.class );
    }

    @Override
    public List<Table> findAllById(ArrayList<Long> tablesIds) {
        TypedQuery<Table> query = super.entityManager.createQuery("from restTable a where a.tableId in (:tablesIds)", Table.class);
        query.setParameter("tablesIds",tablesIds);
        List<Table> tableList = query.getResultList();
        return tableList;
    }
}

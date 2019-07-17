package mum.edu.cs544.dao.Implementation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class GenericDAO<T> implements mum.edu.cs544.dao.GenericDAO<T> {

    @PersistenceContext
    protected EntityManager entityManager;
    protected Class<T> daoClass;

    public void setDaoClass(Class<T> type) {
        daoClass = type;
    }

    public void save( T entity ){
        entityManager.merge( entity );
    }

    public void delete( T entity ){
        entityManager.remove( entity );
    }

    @Override
    public void delete(Long id) {
        T entity = findOne( id );
        delete( entity );
    }

    @Override
    public T findOne( Long id ){
        return (T) entityManager.find(daoClass, id );
    }

    @Override
    public List<T> findAll(){
        return entityManager.createQuery( "from " + daoClass.getName() )
                .getResultList();
    }

    @Override
    public T update( T entity ){
        return entityManager.merge( entity );
    }

}

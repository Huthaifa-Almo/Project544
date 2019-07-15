package mum.edu.cs544.dao;

import java.util.List;

public interface GenericDAO<T>{
    void save(T t);
    void delete(Long id);
    T findOne(Long id);
    T update(T t);
    List<T> findAll();
}

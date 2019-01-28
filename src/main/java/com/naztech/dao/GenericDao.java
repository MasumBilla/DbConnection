package com.naztech.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDao<T> {
	
	public boolean save(T sql)throws ClassNotFoundException, SQLException;
    public boolean update(T sql)throws ClassNotFoundException, SQLException;
    public boolean delete(T sql)throws ClassNotFoundException, SQLException;
    public T find(int id)throws ClassNotFoundException, SQLException;
    public List<T> getAll()throws ClassNotFoundException, SQLException;


}

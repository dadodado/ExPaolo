package mydb_app.dao;

import java.io.Serializable;
import java.util.List;

public interface MyDao {
	
	public void add(Serializable macchina);
	
	public void delete(Serializable macchina);
	
	public void deleteById(Serializable id);
	
	public List<Serializable> list();

}

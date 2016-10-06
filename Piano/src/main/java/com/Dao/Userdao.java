package com.Dao;

import java.util.List;
 
import com.model.User;
 
public interface Userdao {
    public List<Userdao> list();
     
    public Userdao get(int id);
     
    public void saveOrUpdate(Userdao user);
     
    public void delete(int id);

	void saveOrUpdate(User user);
}
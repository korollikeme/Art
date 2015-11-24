package com.springMVC.dao;
import java.util.List;
import com.springMVC.entity.User;


public interface UserDao {

	public void update(User user);
	
	public void save(User user);
//	public void save1(int age,String username,String sex,String password,Date birthday);
	public List<User> getAllUser();
	//ͨ����������ѯ�û�
	public User getUserByname(String username);
	//ɾ���û�
	public void deleteById(int id);
}

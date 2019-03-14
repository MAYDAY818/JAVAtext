package com.hibernate.ui;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entity.Shopping;
import com.hibernate.entity.User;
import com.hibernate.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		User u = new User(2,"张三","zhang");
		Shopping p = new Shopping(111);
		
		//建立关联
		u.setPerson(p);
		p.setUser(u);
		
		Test t = new Test();
//		t.saveUser(u);
		
		//更新之前先查询
//		User u1 = t.findUserById(1);
//		u1.getPerson().setRealName("张学友");
//		t.updateUser(u1);
//		System.out.println(t.findUserById(1));
		
		//删除之前先查询
//		User u2 = t.findUserById(1);
//		t.deleteUser(u2);
	}
	
	public void saveUser(User u) {
		//打开session
		Session session = HibernateUtil.openSession();
		//开启数据库事务
		Transaction transaction = session.beginTransaction();
		//保存
		session.save(u);
		//提交数据库事务
		transaction.commit();
		//关闭session
		session.close();
	}

	//更新
	public void updateUser(User u) {
		//打开session
		Session session = HibernateUtil.openSession();
	    //开启数据库事务
	    Transaction transaction = session.beginTransaction();
		//更新
		session.update(u);
		//提交数据库事务
		transaction.commit();
		//关闭session
		session.close();
	}
	
	//根据id查询
	public User findUserById(int id) {
		//打开session
		Session session = HibernateUtil.openSession();
		//根据id查询
		User u = session.get(User.class, id);
		//关闭session
		session.close();
		return u;
	}
	
	//删除
	public void deleteUser(User u) {
		//打开session
		Session session = HibernateUtil.openSession();
	    //开启数据库事务
	    Transaction transaction = session.beginTransaction();
		//删除
		session.delete(u);
		//提交数据库事务
		transaction.commit();
		//关闭session
		session.close();		
	}
}

package ui;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.User;
import util.HibernateUtil;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u =new User(2,"张三","123456");
		Text text = new Text();
		text.saveUser(u);
//		System.out.println(text.findUserById(1));
	}
	//保存
	public void saveUser(User user) {
		Session session = HibernateUtil.getSession();
		Transaction tr=session.beginTransaction();
		session.save(user);
		tr.commit();
		session.close();
	}
	//更新
	public void updateUser(User user) {
		Session session = HibernateUtil.getSession();
		Transaction tr=session.beginTransaction();
		session.update(user);
		tr.commit();
		session.close();
	}
	public User findUserById(int id) {
		Session session = HibernateUtil.getSession();
		User u = session.get(User.class, 1);
		session.close();
		return u;
	}
	public void deleteUser(User user) {
		Session session = HibernateUtil.getSession();
		Transaction tr=session.beginTransaction();
		session.delete(user);
		tr.commit();
		session.close();
	}
}

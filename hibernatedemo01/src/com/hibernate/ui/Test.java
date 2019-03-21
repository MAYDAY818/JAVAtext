package com.hibernate.ui;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entity.User;

public class Test {
	public static void main(String[] args) {

		User user = new User(3,"xiao","123456")
		Test t = new Test();
		t.saveUser(user);;
	}
	
	public void saveUser(User u) {
		//��session
		Session session = HibernateUtil.openSession();
		//�������ݿ�����
		Transaction transaction = session.beginTransaction();
		//����
		session.save(u);
		//�ύ���ݿ�����
		transaction.commit();
		//�ر�session
		session.close();
	}

	//����
	public void updateUser(User u) {
		//��session
		Session session = HibernateUtil.openSession();
	    //�������ݿ�����
	    Transaction transaction = session.beginTransaction();
		//����
		session.update(u);
		//�ύ���ݿ�����
		transaction.commit();
		//�ر�session
		session.close();
	}
	
	//��ѯ
	public User findUserById(int id) {
		//��session
		Session session = HibernateUtil.openSession();
		//����
		User u = session.get(User.class, id);
		//�ر�session
		session.close();
		return u;
	}
	
	//ɾ��
	public void deleteUser(User u) {
		//��session
		Session session = HibernateUtil.openSession();
	    //�������ݿ�����
	    Transaction transaction = session.beginTransaction();
		//ɾ��
		session.delete(u);
		//�ύ���ݿ�����
		transaction.commit();
		//�ر�session
		session.close();		
	}

}

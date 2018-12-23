package com.qf.utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MbSessionFactory {
	
	private static ThreadLocal<SqlSession> threadLocal;
	private static SqlSessionFactory factory;
	
	static {
		threadLocal = new ThreadLocal<>();
		// 读取配置文件
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("mb.xml");
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//获得连接
		public static SqlSession getSession() {
			SqlSession session = threadLocal.get();
			if(session==null) {
				session = factory.openSession();
				threadLocal.set(session);
			}
			return session;
		}
		//关闭连接
		public static void closeSession() {
			SqlSession session = threadLocal.get();
			if(session!=null) {
				session.close();
				threadLocal.remove();
				threadLocal.set(null);
			}

		}
}

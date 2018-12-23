package com.qf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.qf.utils.MbSessionFactory;

@Component
@Aspect
public class OrdersProxy {
	
	//3 环绕切入
	@Around("execution (* com.qf.service.*.find*(..))")
	public Object findOrdersByInput(ProceedingJoinPoint jp) throws Throwable {
		Object obj = null;

		try {
			obj = jp.proceed();
			
		}catch(Exception e) {
			
			throw e;
		}finally {
			MbSessionFactory.closeSession();
		}
		return obj;
	}
	@Around("execution (* com.qf.service.*.add*(..))")
	public Object addOrdersByCid(ProceedingJoinPoint jp) throws Throwable {
		Object obj = null;

		try {
			obj = jp.proceed();
			MbSessionFactory.getSession().commit();
		}catch(Exception e) {
			MbSessionFactory.getSession().rollback();
			throw e;
		}finally {
			MbSessionFactory.closeSession();
		}
		return obj;
	}
}

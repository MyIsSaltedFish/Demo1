package com.qf.test;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qf.entity.Orders;
import com.qf.service.OrdersService;
//创建容器																
@RunWith(SpringJUnit4ClassRunner.class)																
//指定创建容器时使用哪个配置文件																
@ContextConfiguration("classpath:applicationContext.xml")		
public class OrdersServiceTest {
	@Autowired
	private OrdersService service;
	@Test													
	public void testFindOrdersByInput() throws ParseException {
		
		List<Orders> lsit = service.findOrdersByInput(null, null, new Date(), null);
		for (Orders orders : lsit) {
			System.out.println(orders.getMiaoshu()+":"+orders.getCname());
		}
	}
	@Test														
	public void testAddOrdersByCid() {
		Orders orders = new Orders(null, 1, new Date(), "买了100张电影票", null, null, null);
		service.addOrdersByCid(orders);
		System.out.println();
	}

}

package com.qf.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qf.entity.Orders;
import com.qf.mapper.OrdersMapper;
import com.qf.utils.MbSessionFactory;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	private OrdersMapper ordersMapper;
	public OrdersServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	public OrdersMapper getOrdersMapper() {
		return ordersMapper;
	}


	public void setOrdersMapper(OrdersMapper ordersMapper) {
		this.ordersMapper = ordersMapper;
	}


	//根据输入查询
    public List<Orders> findOrdersByInput(String miaoshu,Integer cid,Date date1,Date date2){
		List<Orders> list = null;
//    	try {
    		ordersMapper = MbSessionFactory.getSession().getMapper(OrdersMapper.class);
    		Orders orders = new Orders(null, cid, null, miaoshu, null, date1, date2);
			list=ordersMapper.findOrdersByInput(orders);
//    	}catch(Exception e) {
//    		
//    		throw e;
//    	}finally {
//    		MbSessionFactory.closeSession();
//    	}
    	return list;
    }

	@Override
	public int addOrdersByCid(Orders orders) {
		int count = 0;
//		try {
    		ordersMapper = MbSessionFactory.getSession().getMapper(OrdersMapper.class);
    		
    		count = ordersMapper.insertSelective(orders);
			MbSessionFactory.getSession().commit();
//    	}catch(Exception e) {
//    		MbSessionFactory.getSession().rollback();
//    		throw e;
//    	}finally {
//    		MbSessionFactory.closeSession();
//    	}
		return count;
	}
}

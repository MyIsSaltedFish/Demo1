package com.qf.service;

import java.util.Date;
import java.util.List;



import com.qf.entity.Orders;

public interface OrdersService {
	List<Orders> findOrdersByInput(String miaoshu,Integer cid,Date date1,Date date2);
	int addOrdersByCid(Orders orders);

}

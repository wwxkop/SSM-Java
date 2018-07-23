package org.imooc.service;

import java.util.List;

import org.imooc.dto.OrdersDto;

public interface OrdersService {
	
	boolean add(OrdersDto ordersDto);
	
	OrdersDto getById(Long id);
	
	List<OrdersDto> getListByMemberId(Long memberId);
}
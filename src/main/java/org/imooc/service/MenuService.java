package org.imooc.service;

import java.util.List;

import org.imooc.dto.MenuDto;
import org.imooc.dto.MenuForMoveDto;
import org.imooc.dto.MenuForZtreeDto;

public interface MenuService {
	
	List<MenuForZtreeDto> getZtreeList();
	
	List<MenuDto> getList(MenuDto menuDto);
	
	boolean add(MenuDto menuDto);
	
	boolean remove(Long id);
	
	MenuDto getById(Long id);
	
	boolean modify(MenuDto menuDto);
	
	boolean order(MenuForMoveDto menuForMoveDto);
}

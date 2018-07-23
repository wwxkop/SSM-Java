package org.imooc.service;

import java.util.List;

import org.imooc.dto.GroupDto;

public interface GroupService {
	
	List<GroupDto> getList();
	
	boolean modify(GroupDto groupDto);
	
	boolean add(GroupDto groupDto);
	
	boolean remove(Long id);
	
	GroupDto getById(Long id);
	
	GroupDto getByIdWithMenuAction(Long id);
	
	boolean assignMenu(GroupDto groupDto);
}
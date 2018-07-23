package org.imooc.service;

import java.util.List;

import org.imooc.dto.UserDto;

public interface UserService {
	
	boolean validate(UserDto userDto);
	
	List<UserDto> getList();
	
	boolean modify(UserDto userDto);
	
	boolean add(UserDto userDto);
	
	boolean remove(Long id);
	
	UserDto getById(Long id);
}
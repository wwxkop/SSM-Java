package org.imooc.service;

import java.util.List;

import org.imooc.dto.BusinessDto;
import org.imooc.dto.BusinessListDto;

public interface BusinessService {
	
	boolean add(BusinessDto businessDto);
    
    BusinessDto getById(Long id);
    
    List<BusinessDto> searchByPage(BusinessDto businessDto);
    
    BusinessListDto searchByPageForApi(BusinessDto businessDto);
}

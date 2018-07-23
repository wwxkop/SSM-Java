package org.imooc.service;

import java.util.List;

import org.imooc.dto.AdDto;

public interface AdService {
    
    boolean add(AdDto adDto);
    
    List<AdDto> searchByPage(AdDto adDto);
    
    boolean remove(Long id);
    
    AdDto getById(Long id);
    
    boolean modify(AdDto adDto);
}

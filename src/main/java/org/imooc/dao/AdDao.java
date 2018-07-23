package org.imooc.dao;

import java.util.List;

import org.imooc.bean.Ad;

public interface AdDao {
    
    int insert(Ad ad);
    
    List<Ad> selectByPage(Ad ad);
    
    Ad selectById(Long id);
    
    int update(Ad ad);
    
    int delete(Long id);
}
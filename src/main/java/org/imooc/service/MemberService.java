package org.imooc.service;

public interface MemberService {
    
    boolean exists(Long phone);
    
    boolean saveCode(Long phone,String code);
    
    boolean sendCode(Long phone,String content);
    
    String getCode(Long phone);

    void saveToken(String token,Long phone);

    Long getPhone(String token);
    
    Long getIdByPhone(Long phone);
}
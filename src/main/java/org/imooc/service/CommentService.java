package org.imooc.service;

import org.imooc.bean.Page;
import org.imooc.dto.CommentForSubmitDto;
import org.imooc.dto.CommentListDto;

public interface CommentService {
    
    boolean add(CommentForSubmitDto commentForSubmitDto);
    
    CommentListDto getListByBusinessId(Long businessId,Page page);
}
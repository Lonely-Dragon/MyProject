package com.sakura.springsecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sakura.springsecurity.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sakura
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    
    
    
}

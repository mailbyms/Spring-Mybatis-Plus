package com.gyjian.mybatisplus.service.impl;

import com.gyjian.mybatisplus.entity.User;
import com.gyjian.mybatisplus.mapper.UserMapper;
import com.gyjian.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mybatis-plus
 * @since 2022-01-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

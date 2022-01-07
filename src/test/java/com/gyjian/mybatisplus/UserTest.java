package com.gyjian.mybatisplus;

import com.gyjian.mybatisplus.entity.User;
import com.gyjian.mybatisplus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setAge(10);
        user.setName("mike");

        int result = userMapper.insert(user);
        System.out.println("insert result: " + result);

        System.out.println("user:" + user);


        long dataCenterId = (user.getId() >> (12 + 5)) & 0x1F;
        long machineId = (user.getId() >> 12) & 0x1F;
        System.out.println("dataCenterId: " + dataCenterId + ", machineId: " + machineId);

    }

    @Test
    public void testDelete(){
        int result = userMapper.deleteById(2);
        System.out.println("delete result: " + result);
    }
}



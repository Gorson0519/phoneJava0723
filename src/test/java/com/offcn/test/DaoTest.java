package com.offcn.test;

import com.offcn.bean.Mobile;
import com.offcn.dao.MobileMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        MobileMapper mapper = context.getBean(MobileMapper.class);

        Mobile mobile = mapper.getMoblie("1886655");
        System.out.println(mobile);
    }
}

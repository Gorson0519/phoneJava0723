package com.offcn.test;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml", "spring/spring-service.xml");
        MobileService service = context.getBean(MobileService.class);
        Mobile mobile = service.getMobile("1886656");
        System.out.println(mobile);
    }
}

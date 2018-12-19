package com.offcn.controller;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MobileController {

    @Autowired
    MobileService mobileService;

    @RequestMapping("getMoble")
    @ResponseBody
    public Mobile getMoble(String mobilenumber){

        Mobile mobile = mobileService.getMobile(mobilenumber);
        System.out.println(mobile);
        return mobile;

    }

}

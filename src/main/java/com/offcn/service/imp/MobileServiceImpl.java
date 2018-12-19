package com.offcn.service.imp;

import com.offcn.bean.Mobile;
import com.offcn.dao.MobileMapper;
import com.offcn.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    MobileMapper mobileMapper;

    @Override
    public Mobile getMobile(String mobileNumber) {
        return mobileMapper.getMoblie(mobileNumber);
    }
}

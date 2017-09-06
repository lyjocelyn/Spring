package com.jocelyn.service;

import com.jocelyn.annotation.CustomQualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/6/006.
 */
@Service
@CustomQualifier
public class LoginWhithCustomQualifier implements ILogin {

    @Override
    public String login() {
        return "customQualifier";
    }
}

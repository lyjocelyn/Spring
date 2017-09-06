package com.jocelyn.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/5/005.
 */
@Service
@Qualifier("userName")
public class LoginByUserName implements ILogin {

    @Override
    public String login() {
        return "userName";
    }
}

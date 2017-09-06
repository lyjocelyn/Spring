package com.jocelyn.server;

import com.jocelyn.service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/6/006.
 */
@RestController
public class QualifierResource {


    @Autowired
    @Qualifier("email")
    private ILogin loginByEmail;

    @Autowired
    @Qualifier("mobile")
    private ILogin loginByMobil;

    @Autowired
    @Qualifier("userName")
    private ILogin loginByUserName;

    @GetMapping("/testQualifier")
    public String testQualifier() {
        return loginByEmail.login() + " "
                + loginByMobil.login() + " "
                +loginByUserName.login() + " ";
    }
}

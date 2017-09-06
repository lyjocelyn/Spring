package com.jocelyn.server;

import com.jocelyn.annotation.CustomQualifier;
import com.jocelyn.service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/6/006.
 */
@RestController
public class CustomQualifierResource {

    @Autowired
    @CustomQualifier
    private ILogin login;

    @GetMapping("/testCustomQualifier")
    public String testCustomQualifier() {
        return login.login();
    }
}

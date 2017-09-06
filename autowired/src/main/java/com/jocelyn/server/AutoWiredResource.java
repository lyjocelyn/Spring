package com.jocelyn.server;

import com.jocelyn.service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/9/5/005.
 */
@RestController
public class AutoWiredResource {

    @Autowired
    private Set<ILogin> logins;

    @Autowired
    private Map<String, ILogin> loginMap;

    @GetMapping("/login")
    public String testAutowired() {
        if (null == loginMap) {
            return "empty";
        }

        return String.valueOf(loginMap.toString());
    }
}

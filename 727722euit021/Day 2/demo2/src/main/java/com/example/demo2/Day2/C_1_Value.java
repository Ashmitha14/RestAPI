package com.example.demo2.Day2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class C_1_Value {
    @Value("${app.name}")
    public String appName;
    
    @Value("${app.version}")
    public String appVersion;

    @GetMapping("/info")
    public String getMethodName() {
        return ("AppName: "+appName+ "AppVersion: "+appVersion);
    }
    
}



// package com.examly.springapp.controller;

// import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.examly.springapp.config.AppConfig;

// @RestController
// public class ApiController {
//    //@Value("${app.Name}")
//     //public String appName;
    
//    // @Value("${app.Version}")
//    // public String appVersion;
//    @Autowired
//    AppConfig appconfig;
//     @GetMapping("/info")
//     public String getMethodName()
//     {
//         return("App Name: "+appconfig.appName+",Version:"+appconfig.appVersion);
//     }

    
// }
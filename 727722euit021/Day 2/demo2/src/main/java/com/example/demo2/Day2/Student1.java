// package com.examly.springapp.config;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class AppConfig {
//     //String appName;
//     //String appVersion;
//     @Value("${app.name}")
//     public String appName;
    
//     @Value("${app.version}")
//     public String appVersion;
    
//     public String getAppName() {
//         return appName;
//     }
//     public void setAppName(String appName) {
//         this.appName = appName;
//     }
//     public String getAppVersion() {
//         return appVersion;
//     }
//     public void setAppVersion(String appVersion) {
//         this.appVersion = appVersion;
//     }
//     public AppConfig(String appName, String appVersion) {
//         this.appName = appName;
//         this.appVersion = appVersion;
//     }
// }
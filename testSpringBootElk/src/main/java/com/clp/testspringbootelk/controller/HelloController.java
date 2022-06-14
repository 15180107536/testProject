package com.clp.testspringbootelk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cp
 * @date 2022/4/13 15:27
 */
@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public void hello(){
        log.info("测试elk");
    }
}

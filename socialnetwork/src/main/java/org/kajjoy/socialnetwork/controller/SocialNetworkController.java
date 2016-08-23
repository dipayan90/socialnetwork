package org.kajjoy.socialnetwork.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dipayan on 8/22/16.
 */

@RestController
public class SocialNetworkController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}

package com.tools.devtools.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/test")
    public String test() {
        int a = 10;
        int b = 20;
        int c = 90;
        int d = 120;
        return "This is just testing /t sum of a and b is " + (a + b + c + d);
    }
}

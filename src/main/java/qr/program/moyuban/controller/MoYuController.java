package qr.program.moyuban.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qr
 * @date 2022/4/27 10:35
 */
@RestController
@RequestMapping("/moyu/")
public class MoYuController {


    @RequestMapping("greet")
    public String test() {
        return "Hello";
    }
}

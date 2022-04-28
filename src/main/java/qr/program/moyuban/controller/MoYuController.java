package qr.program.moyuban.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qr.program.moyuban.utils.MoYuUtil;

/**
 * @author qr
 * @date 2022/4/27 10:35
 */
@RestController
@RequestMapping("/moyu/")
public class MoYuController {

    @GetMapping("/mo")
    public String moYu() {
        MoYuUtil.getHolidaysByYear("2022");
        return null;
    }


    @RequestMapping("greet")
    public String test() {
        return "Hello";
    }
}

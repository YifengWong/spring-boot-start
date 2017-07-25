package ui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by YifengWong on 2017/7/25.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

}

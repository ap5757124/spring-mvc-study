package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springmvc.entity.User;

@Controller
@RequestMapping("/fm")
public class FreemarkerController {
    @GetMapping("/test")
    public ModelAndView showTest(){
        ModelAndView mav = new ModelAndView("/test");
        User user = new User();
        user.setUsername("andy");
        mav.addObject("u", user);
        return mav;
    }
}

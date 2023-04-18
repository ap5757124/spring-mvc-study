package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springmvc.entity.User;

@Controller
@RequestMapping("/um")
public class URLMappingController {
    @GetMapping("/g")
    //作用在方法上,不再区分get/post请求
    // @RequestMapping("/g")
    //@RequestMapping(value="/g",method = RequestMethod.GET)
    @ResponseBody
    public String getMapping(@RequestParam("test_name") String testName) {
        System.out.println("testName = " + testName);
        return "getMapping成功";

    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping(String username, Long password) {
        System.out.println("username = " + username + ", password = " + password);
        return "postMapping";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping1(User user) {
        System.out.println("user = " + user.getUsername() + "----" + user.getPassword() + "," + user.getCreateTime());
        return "postMapping User成功";
    }

    @GetMapping("/view")
    public ModelAndView showView(Integer userId) {
        ModelAndView mav = new ModelAndView("/view.jsp");
        User user = new User();
        if(userId == 1){
            user.setUsername("lily");
        }else if(userId == 2){
            user.setUsername("smith");
        }else if(userId == 3){
            user.setUsername("lina");
        }
        mav.addObject("u" , user);
        return mav;
    }

}

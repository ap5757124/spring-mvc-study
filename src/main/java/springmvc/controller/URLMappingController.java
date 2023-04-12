package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class URLMappingController {
    @GetMapping("/g")
    @ResponseBody
    public String getMapping() {
        return "getMapping";
    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping() {
        return "postMapping";
    }

}

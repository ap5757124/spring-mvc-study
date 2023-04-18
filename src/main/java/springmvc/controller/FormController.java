package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.entity.Form;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    @PostMapping("/apply")
    @ResponseBody
    public String apply(String name, String course, Integer[] purpose) {
        System.out.println("name = " + name + ", course = " + course + ", purpose = " + Arrays.deepToString(purpose));
        return "apply";
    }

    @PostMapping("/apply1")
    @ResponseBody
    //使用List 需要使用@RequestParam
    public String apply1(String name, String course, @RequestParam List<Integer> purpose) {
        System.out.println("name = " + name + ", course = " + course + ", purpose = " + purpose);
        for(Integer pur:purpose) {
            System.out.println(pur);
        }
        return "apply1";
    }

    @PostMapping("/apply2")
    @ResponseBody
    public String apply2(Form form) {
        System.out.println("form = " + form.getName() + "---" + form.getCourse() + "---" + form.getPurpose());
        for(Integer pur:form.getPurpose()) {
            System.out.println(pur);
        }
        return "apply2";
    }

    @PostMapping("/applyDelivery")
    @ResponseBody
    public String applyDelivery(Form form) {
        System.out.println("form = " + form.getName() + "," + form.getCourse() + "," + form.getPurpose());
        System.out.println("delivery = " + form.getDelivery().getName() + "," + form.getDelivery().getMobile() + "," + form.getDelivery().getAddress());


        return "applyDelivery";
    }
}

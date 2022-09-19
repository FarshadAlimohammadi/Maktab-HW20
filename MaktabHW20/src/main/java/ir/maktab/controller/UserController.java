package ir.maktab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String display(@RequestParam("name") String name, @RequestParam("password") String password, Model model){
        if (password.equals("admin")){
            String msg = "hello " + name;
            model.addAttribute("message", msg);
            return "viewpage";
        }else {
            String msg = "sorry " + name + " wrong password";
            model.addAttribute("message", msg);
            return "errorpage";
        }
    }

}

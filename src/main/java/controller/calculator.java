package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class calculator {
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView tt(@RequestParam("one") int one, @RequestParam("two") int two,@RequestParam("a") char a, Model up) {
        int kq = 0;
        switch (a){
            case '+':
                kq = one + two;
                break;
            case '-':
                kq = one - two;
                break;
            case '*':
                kq = one * two;
                break;
            case '/':
                kq = one / two;
                break;
        }
        up.addAttribute("kq", kq);
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}

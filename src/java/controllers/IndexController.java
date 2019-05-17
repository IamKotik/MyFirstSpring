package controllers;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
@RequestMapping(value="/index", method = RequestMethod.GET)
    public String helloWorld(ModelMap map) {
        map.addAttribute("my_hello", "Самойлова Т.А. приветствует вас на своей главной странице !!");
        return "index";  //Имя страницы, которая принимает данные
    }
}

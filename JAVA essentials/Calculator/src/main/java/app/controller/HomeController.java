package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello Spring");
        return "home";
    }

    @RequestMapping("/greeting")
    public String greeting(
            @RequestParam(value = "myname", defaultValue = "Unknown") String myname,
            @RequestParam(value = "city", defaultValue = "Unknown") String city,
            Model model) {
        model.addAttribute("username", myname);
        return "greeting";
    }

    @RequestMapping("/files")
    public String files(Model model) {

        File path = new File("c:\\");
        File[] allFiles =
                path.listFiles();

        model.addAttribute("allFiles", allFiles);
        return "files";

    }
}

package io.github.tjwnuk.miniblog.Controllers;

import io.github.tjwnuk.miniblog.Data.Entry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Component
@Controller
public class HomeController {

    @GetMapping("")
    public String home(Model model) {
        Entry wpis = new Entry("admin", "witajcie na naszej stronie", new Date(System.currentTimeMillis()));
        model.addAttribute("entry", wpis);
        return "home";
    }
}

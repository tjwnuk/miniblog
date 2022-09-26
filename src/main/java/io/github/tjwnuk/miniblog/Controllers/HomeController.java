package io.github.tjwnuk.miniblog.Controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HomeController {

    @GetMapping("")
    public String home() {
        return "strona główna miniblog.pl";
    }
}

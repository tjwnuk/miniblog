package io.github.tjwnuk.miniblog.Controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Controller
public class AddEntryController {

    @GetMapping("/add")
    public String addEntryView() {
        return "addEntry";
    }

    @PostMapping("/add")
    public String addEntry() {
        System.out.println("dodaje nowy wpis");
        return "home";
    }
}

package io.github.tjwnuk.miniblog.Controllers;

import io.github.tjwnuk.miniblog.Data.Entry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@Controller
public class HomeController {

    @GetMapping("")
    public String home(Model model) {

        Entry entry1 = new Entry("admin", "witajcie na naszej stronie", new Date(System.currentTimeMillis()));
        Entry entry2 = new Entry("m__b", "wykop jest do dupy", new Date(System.currentTimeMillis()));
        Entry entry3 = new Entry("a__s", "Postujcie ciepłe placki", new Date(System.currentTimeMillis()));

        List<Entry> entryList = Arrays.asList(entry1, entry2, entry3);

        model.addAttribute("entryList", entryList);
        return "home";
    }
}

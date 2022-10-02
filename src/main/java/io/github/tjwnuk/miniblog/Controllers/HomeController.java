package io.github.tjwnuk.miniblog.Controllers;

import io.github.tjwnuk.miniblog.Data.Entry;
import io.github.tjwnuk.miniblog.Data.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@Controller
public class HomeController {
    private EntryRepository entryRepository;
    private List<Entry> entryList = new ArrayList<>();

    @Autowired
    public HomeController(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    @ModelAttribute
    public void createEntryList(Model model) {
        Iterable<Entry> entryIterable = entryRepository.findAll();
        for (Entry e : entryIterable) {
            entryList.add(e);
        }
    }

    @GetMapping("")
    public String home(Model model) {
//        model.addAttribute("entryList", entryRepository);
        model.addAttribute(this.entryList);
        return "home";
    }
}

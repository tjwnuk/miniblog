package io.github.tjwnuk.miniblog.Controllers;

import io.github.tjwnuk.miniblog.Data.Entry;
import io.github.tjwnuk.miniblog.Data.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Controller
public class AddEntryController {

    @Autowired
    private EntryRepository entryRepository;

    public AddEntryController(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }
    @GetMapping("/add")
    public String addEntryView(Model model) {
        model.addAttribute("newEntry", new Entry());
        return "addEntry";
    }

    @PostMapping("/add")
    public String addEntry(Entry entry) {
        System.out.println("dodaje nowy wpis");
        System.out.println(entry);
        this.entryRepository.save(entry);

        return "redirect:/";
    }
}

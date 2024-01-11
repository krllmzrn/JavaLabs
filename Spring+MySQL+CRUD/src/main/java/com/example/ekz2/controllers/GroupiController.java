package com.example.ekz2.controllers;

import com.example.ekz2.entity.Groupi;
import com.example.ekz2.entity.Kafedra;
import com.example.ekz2.repository.GroupiRepository;
import com.example.ekz2.repository.KafedraRepository;
import com.example.ekz2.service.GroupiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/groupi")
public class GroupiController {
    @Autowired
    private GroupiRepository groupiRepository;
    @Autowired
    private KafedraRepository kafedraRepository;
    @Autowired
    private GroupiService groupiService;


    @GetMapping()
    public String showTable(Model model) {
        List<Groupi> listG = groupiRepository.findAll();

        model.addAttribute("listG", listG);

        return "groupi";
    }
}

package com.example.ekz2.controllers;



import com.example.ekz2.entity.Groupi;
import com.example.ekz2.repository.GroupiRepository;
import com.example.ekz2.service.GroupiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
public class CRUDController {
    @Autowired
    private GroupiRepository groupiRepository;
    @Autowired
    private GroupiService groupiService;


    @GetMapping("/groupi/addGroupi")
    public String addGroupi(Model model) {
        return "addGroupi";
    }

    @PostMapping("/groupi/addGroupi")
    public String groupiAddConfirm(@RequestParam String groupa, @RequestParam String year, @RequestParam String kafedra, Model model){
        Groupi groupi = new Groupi(groupa, year, kafedra);
        groupiRepository.save(groupi);
        return "redirect:/groupi";}

    /**             Редактирование           **/
    @GetMapping("/groupi/{id}/editGroupi")
    public String editGroupi(@PathVariable(value = "id") int id, Model model){
        Groupi groupi = groupiService.findById(id);
        model.addAttribute("groupa", groupi.getGroupa());
        model.addAttribute("year", groupi.getYear());
        model.addAttribute("kafedra", groupi.getKafedra());
        return "editGroupi";
    }
    @PostMapping("/groupi/{id}/editGroupi")
    public String userEditConfirm(@PathVariable(value = "id") int id, @RequestParam String groupa, @RequestParam String year, @RequestParam String kafedra, Model model){
        Groupi groupi = groupiService.findById(id);
        groupi.setGroupa(groupa);
        groupi.setYear(year);
        groupi.setKafedra(kafedra);
        groupiRepository.save(groupi);
        return "redirect:/groupi";
    }

    /**             Удаление             **/
    @GetMapping("/groupi/{id}/deleteGroupi")
    public String userDelete(@PathVariable(value = "id") int id, Model model){
        groupiRepository.deleteById(id);
        return "redirect:/groupi";
    }
}

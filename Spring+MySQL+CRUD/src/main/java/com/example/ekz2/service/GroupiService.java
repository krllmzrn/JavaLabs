package com.example.ekz2.service;


import com.example.ekz2.entity.Groupi;
import com.example.ekz2.repository.GroupiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupiService {
    @Autowired
    private GroupiRepository groupiRepository;

    public Groupi findByGroupa(String groupa) {
        Optional<Groupi> groupiFromDb = groupiRepository.findByGroupa(groupa);
        return groupiFromDb.orElse(new Groupi());
    }
    public Groupi findById(Integer id) {
        Optional<Groupi> groupiFromDb = groupiRepository.findById(id);
        return groupiFromDb.orElse(new Groupi());
    }
}

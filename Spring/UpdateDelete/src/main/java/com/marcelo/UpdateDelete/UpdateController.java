package com.marcelo.UpdateDelete;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.UpdateDelete.models.update;
import com.marcelo.UpdateDelete.services.UpdateServices;


@RestController
public class UpdateController {
    private final UpdateServices updateservice;
    public UpdateController(UpdateServices updateservice){
        this.updateservice = updateservice;
    }
    @RequestMapping("/api/books")
    public List<Update> index() {
        return updateservice.allUpdate();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Update create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        update update = new update(title, desc, lang, numOfPages);
        return updateservice.createUpdate(update);
    }
    
    @RequestMapping("/api/books/{id}")
    public Update show(@PathVariable("id") Long id) {
        Update update = updateservice.findUpdate(id);
        return update;
    }
}

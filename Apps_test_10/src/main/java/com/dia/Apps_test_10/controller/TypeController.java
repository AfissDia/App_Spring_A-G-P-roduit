package com.dia.Apps_test_10.controller;

import com.dia.Apps_test_10.model.Type;
import com.dia.Apps_test_10.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class TypeController {
    @Autowired private TypeService typeService;

    @GetMapping("/types")
    public List<Type> getAllProduit(){
        return typeService.getAllType();
    }
    @PostMapping("/types/add")
    public void addProduit(@RequestBody Type type){
        typeService.addType(type);
    }
    @PutMapping("types/{id}/update")
    public void editType(@PathVariable("id") Long id, @RequestBody Type type){
        typeService.editType(type);
    }
    @DeleteMapping("/types/{id}/delete")
    public void deleteType(@PathVariable("id") Long id){
        typeService.deleteType(id);
    }

    @GetMapping("/types/{id}")
    public Optional<Type> getTypeById(@PathVariable Long id){
        return typeService.getAllById(id);
    }
}

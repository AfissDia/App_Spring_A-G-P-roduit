package com.dia.Apps_test_10.service;

import com.dia.Apps_test_10.model.Type;
import com.dia.Apps_test_10.repository.TypeRepository;
//import com.dia.Apps_test_10.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService {
    @Autowired private TypeRepository typeRepository;

    public List<Type> getAllType(){
        return typeRepository.findAll();
    }
    public void addType(Type type){
        typeRepository.save(type);
    }
    public void editType(Type type){
        typeRepository.save(type);
    }
    public void deleteType(Long id){
        typeRepository.deleteById(id);
    }
    public Optional<Type> getAllById(Long id){
        return typeRepository.findById(id);
    }
}

package com.dia.Apps_test_10.service;

import com.dia.Apps_test_10.model.Produit;
import com.dia.Apps_test_10.model.Type;
import com.dia.Apps_test_10.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {

    @Autowired private ProduitRepository produitRepository;

    public List<Produit> getAllProduit(){
        return produitRepository.findAll();
    }
    public void addProduit(Produit produit){
        produitRepository.save(produit);
    }
    public void editProduit(Produit produit){
        produitRepository.save(produit);
    }
    public void deleteProduit(Long id){
        produitRepository.deleteById(id);
    }
    public Optional<Produit> getAllById(Long id){
        return produitRepository.findById(id);
    }
}

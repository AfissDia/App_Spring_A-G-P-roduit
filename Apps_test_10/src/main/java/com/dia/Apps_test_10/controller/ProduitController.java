package com.dia.Apps_test_10.controller;

import com.dia.Apps_test_10.model.Produit;
import com.dia.Apps_test_10.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/produits")
    public List<Produit> getAllProduit(){
        return produitService.getAllProduit();
    }

    @PostMapping("/produits/add")
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }

    @PutMapping("produits/{id}/update")
    public void editProduit(@PathVariable("id") Long id, @RequestBody Produit produit){
        produitService.editProduit(produit);
    }

    @DeleteMapping("/produits/{id}/delete")
    public void deleteProduit(@PathVariable("id") Long id){
        produitService.deleteProduit(id);
    }

    @GetMapping("/produits/{id}")
    public Optional<Produit> getProduitById(@PathVariable Long id){
        return produitService.getAllById(id);
    }

}

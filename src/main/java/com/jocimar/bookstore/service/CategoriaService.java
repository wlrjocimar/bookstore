/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jocimar.bookstore.service;

import com.jocimar.bookstore.domain.Categoria;
import com.jocimar.bookstore.repositories.CategoriaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author F5078775
 */
@Service
public class CategoriaService {
    
    @Autowired
    private  CategoriaRepository categoriaRepository;
    
    public Categoria buscaCategoria(Integer id){
        
        Optional<Categoria> categoria =  categoriaRepository.findById(id);
        return categoria.orElse(null);
        
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jocimar.bookstore.service;

import com.jocimar.bookstore.domain.Categoria;
import com.jocimar.bookstore.domain.Livro;
import com.jocimar.bookstore.repositories.CategoriaRepository;
import com.jocimar.bookstore.repositories.LivroRepository;
import com.jocimar.bookstore.service.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author F5078775
 */
@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private CategoriaService categoriaService;

    public Livro buscarLivro(Integer id) {
        
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.orElseThrow(()-> new ObjectNotFoundException("Livro não localizado"));
        
        
        
    }

    public List<Livro> buscarTodos(Integer id_categoria) {
        Categoria categoria = categoriaService.buscaCategoria(id_categoria);
        
       
        
        return livroRepository.findAllByCategoria(id_categoria);



    }
    
    
}
package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
    
	@Autowired
    private CategoriaRepository repo;

    public Optional<Categoria> find(long id){
       Optional<Categoria> obj = repo.findById(id);
       if(!obj.isPresent()){
            throw new ObjectNotFoundException("Objeto não encontrado! id: "+ id + ", tipo: "+ Categoria.class.getName());  
       }
        return obj;
    }
}

package com.nelioalves.cursomc.services;

import java.util.List;
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

       public List<Categoria> buscarTodos(){
       List<Categoria> obj = repo.findAll();
       if(obj.isEmpty()){
            throw new ObjectNotFoundException("Dados não encontrado!, tipo: "+ Categoria.class.getName());  
       }
        return obj;
    }
}

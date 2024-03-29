package com.nelioalves.cursomc.resources;

import java.util.List;
import java.util.Optional;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

/**
 * RestController CategoriaResource
 */
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource{
	@Autowired
   private CategoriaService service;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable long id){
        Optional<Categoria> obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public ResponseEntity<?> listarTodos(){
        List<Categoria> obj = service.buscarTodos();
        return ResponseEntity.ok().body(obj);
    }


}
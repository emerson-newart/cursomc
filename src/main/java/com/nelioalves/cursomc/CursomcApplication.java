package com.nelioalves.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.repositories.ProdutoRepository;
import com.nelioalves.cursomc.resources.CategoriaResource;

@SpringBootApplication
//public class CursomcApplication implements CommandLineRunner {
public class CursomcApplication {

	//@Autowired
	//private CategoriaRepository categoriaRepository;
	//@Autowired
	//private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	//@Override
	//public void run(String... args) throws Exception {

	//	Categoria cat1 = new Categoria("Informática");
	//	Categoria cat2 = new Categoria("Escritório");

	//	Produto p1 = new Produto("NotBook Assus", 2.500);
	//	Produto p2 = new Produto("Cadeira giratorio", 500.0);
	//	Produto p3 = new Produto("Mouse Assus", 35.50);

	//	cat1.getProdutos().addAll(Arrays.asList(p1, p3));
	//	cat2.getProdutos().addAll(Arrays.asList(p2));

	//	p1.getCategorias().addAll(Arrays.asList(cat1));
	//	p2.getCategorias().addAll(Arrays.asList(cat2));
	//	p3.getCategorias().addAll(Arrays.asList(cat1));	
		
	//	categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	//	produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
	//}

}

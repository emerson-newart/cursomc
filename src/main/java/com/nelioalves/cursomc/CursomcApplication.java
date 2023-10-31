package com.nelioalves.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Cidade;
import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.domain.Endereco;
import com.nelioalves.cursomc.domain.Estado;
import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.domain.enums.TipoCliente;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.repositories.EnderecoRepository;
import com.nelioalves.cursomc.repositories.ProdutoRepository;
import com.nelioalves.cursomc.resources.CategoriaResource;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
//public class CursomcApplication {

	//@Autowired
	//private CategoriaRepository categoriaRepository;
	//@Autowired
	//private ProdutoRepository produtoRepository;

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

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

	Estado est1 = new Estado(2, "São Paulo");

	Cidade c1 = new Cidade(1,"Didadema", est1);

	Cliente cli1 = new Cliente("Maria Alves Dias", "mariaalves@gmail.com", "123.456.457-20", TipoCliente.PESSOAFISICA);
	cli1.getTelefones().addAll(Arrays.asList("11 5678-7889","11 2547-8978"));

	Endereco e1 = new Endereco("Rua Flores 154","300","Apto 303", "Jardim", "12454-457", cli1, c1);

	cli1.getEnderecos().addAll(Arrays.asList(e1));

	clienteRepository.save(cli1);
	enderecoRepository.save(e1);
	}

}

package com.poupe.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poupe.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	
	Produto findById(long id);
	
	
	

}

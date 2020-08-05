package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.spring.constants.WebConstants;
import com.spring.model.Product;

@CrossOrigin(origins = WebConstants.ALLOWED_URL)
@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByProductid(int productid);

	@Query("SELECT P FROM Product P WHERE P.productname=:productname")
	List<Product> findByNameContaining(String productname);

	void deleteByProductid(int productid);
}

package com.app.ecom.repository;

import com.app.ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByActiveTrue();

    @Query("SELECT p FROM products p WHERE p.active = true And p.stockQuantity > 0 And  Lower(p.name) LIKE Lower(concat('%', :keyword, '%'))")

    List<Product> searchProducts(@Param("keyword") String keyword);


}

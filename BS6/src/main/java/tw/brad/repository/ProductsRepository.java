package tw.brad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.brad.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}

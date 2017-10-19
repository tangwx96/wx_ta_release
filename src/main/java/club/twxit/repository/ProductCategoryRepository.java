package club.twxit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import club.twxit.dataobject.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

}

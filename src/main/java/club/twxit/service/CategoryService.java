package club.twxit.service;

import java.util.List;

import club.twxit.dataobject.ProductCategory;

public interface CategoryService {
    ProductCategory  findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}

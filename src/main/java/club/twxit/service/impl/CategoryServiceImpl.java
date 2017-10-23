package club.twxit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.twxit.dataobject.ProductCategory;
import club.twxit.repository.ProductCategoryRepository;
import club.twxit.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	private ProductCategoryRepository  pr;
	public ProductCategory findOne(Integer categoryId) {
		// TODO Auto-generated method stub
		return pr.findOne(categoryId);
	}

	public List<ProductCategory> findAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	public List<ProductCategory> findByCategoryTypeIn(
			List<Integer> categoryTypeList) {
		// TODO Auto-generated method stub
		return pr.findByCategoryTypeIn(categoryTypeList);
	}

	public ProductCategory save(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return pr.save(productCategory);
	}

}

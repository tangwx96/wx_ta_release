package club.twxit.service.impl;

import java.util.List;

import org.springframework.data.domain.Pageable;

import club.twxit.dataobject.ProductInfo;
import club.twxit.repository.ProductInfoRepository;
import club.twxit.service.ProductService;

public class ProductServiceImpl implements ProductService{
   private ProductInfoRepository  pi;


	public List<ProductInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProductInfo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductInfo save(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		return pi.save(productInfo);
	}

	public ProductInfo findOne(String productId) {
		// TODO Auto-generated method stub
		return pi.findOne(productId);
	}

}

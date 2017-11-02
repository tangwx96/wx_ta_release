package club.twxit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import club.twxit.dataobject.ProductInfo;
import club.twxit.enums.ProductStatusEnum;
import club.twxit.repository.ProductInfoRepository;
import club.twxit.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
   private ProductInfoRepository  pi;


	public List<ProductInfo> findUpAll() {
		// TODO Auto-generated method stub
		return pi.findByProductStatus(ProductStatusEnum.UP.getCode());
	}

	public Page<ProductInfo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return pi.findAll(pageable);
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

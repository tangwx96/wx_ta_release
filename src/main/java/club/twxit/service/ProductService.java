package club.twxit.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import club.twxit.dataobject.ProductInfo;

public interface ProductService {
    ProductInfo findOne(String productId);
    List<ProductInfo> findAll();
    List<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
}

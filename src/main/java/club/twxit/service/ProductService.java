package club.twxit.service;

import java.util.List;

import club.twxit.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import club.twxit.dataobject.ProductInfo;

public interface ProductService {
	
    ProductInfo findOne(String productId);
    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();
    
    Page<ProductInfo> findAll(Pageable pageable);
    
    ProductInfo save(ProductInfo productInfo);
    
    void increaseStock(List<CartDTO> cartDTOList);

    void dereaseStock(List<CartDTO> cartDTOList);
}

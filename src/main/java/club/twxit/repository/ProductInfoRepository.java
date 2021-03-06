package club.twxit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import club.twxit.dataobject.ProductInfo;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{
   List<ProductInfo> findByProductStatus(Integer productStatus);
}

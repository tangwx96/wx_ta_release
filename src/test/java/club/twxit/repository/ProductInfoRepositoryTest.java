package club.twxit.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import club.twxit.dataobject.ProductInfo;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
	@Autowired
   private ProductInfoRepository pi;
	
	@Test
	public void findUpAllTest(){
		 List<ProductInfo> productInfoList =  pi.findByProductStatus(0
				 );
		 Assert.assertNotEquals(0, productInfoList.size());
	}
   
}

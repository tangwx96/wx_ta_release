package club.twxit.repository;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import club.twxit.dataobject.ProductCategory;
import club.twxit.repository.ProductCategoryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository pr;
    
    @Test
    public void findOneTest(){
    	ProductCategory pc = pr.findOne(1);
    	System.out.println(pc.toString());
    }
    
    @Test
    @Transactional
    public void saveTest(){
    	ProductCategory pc = new ProductCategory();
    	pc.setCategoryName("Ð¡Âó");
    	pc.setCategoryType(4);
    	ProductCategory result = pr.save(pc);
    	Assert.assertNotNull(result);
    }
    
    @Test
    public void updateTest(){
    	ProductCategory pc = pr.findOne(1);
    	pc.setCategoryName("Ð¡µ¾");
    	ProductCategory result = pr.save(pc);
        Assert.assertEquals(result, pc);
    }
    
    @Test
    public void findbyCategoryTypeInTest(){
    	
    }
}

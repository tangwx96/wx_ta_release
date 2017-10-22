package club.twxit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import club.twxit.dataobject.ProductInfo;
import club.twxit.service.CategoryService;
import club.twxit.service.ProductService;
import club.twxit.vo.ProductInfoVO;
import club.twxit.vo.ProductVO;
import club.twxit.vo.ResultVO;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	@RequestMapping("/list")
   public ResultVO list(){
		List<ProductInfo> productInfoList = productService.findUpAll();
		List<Integer> cateoryList = new ArrayList<>();
		for(ProductInfo info : productInfoList){
			cateoryList.add(info.getCategoryType());
		}
		ResultVO resultVO = new ResultVO<>();
		ProductVO productVO = new ProductVO();
		ProductInfoVO productInfoVO = new ProductInfoVO();
	    productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
		resultVO.setData(Arrays.asList(productVO));
		resultVO.setCode(0);
		resultVO.setMessage("SUCCESS");
	return resultVO;
	   
   }
} 

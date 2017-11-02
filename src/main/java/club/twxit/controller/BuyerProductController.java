package club.twxit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import club.twxit.dataobject.ProductCategory;
import club.twxit.dataobject.ProductInfo;
import club.twxit.service.CategoryService;
import club.twxit.service.ProductService;
import club.twxit.utils.ResultVOUtil;
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
	
	@GetMapping("/list")
   public ResultVO list(){
		List<ProductInfo> productInfoList = productService.findUpAll();
		List<Integer> cateoryTypeList = new ArrayList<>();
		for(ProductInfo info : productInfoList){
			cateoryTypeList.add(info.getCategoryType());
		}
		List<ProductCategory> productCateoryList = categoryService.findByCategoryTypeIn(cateoryTypeList);
		
		
		List<ProductVO> productVOList = new ArrayList<>();
		for(ProductCategory productCategory : productCateoryList){
			ProductVO productVO = new ProductVO();
			productVO.setCategoryName(productCategory.getCategoryName());
			productVO.setCategoryType(productCategory.getCategoryType());
			
			
			List<ProductInfoVO> productInfoVOList = new ArrayList<>();
			for (ProductInfo productInfo : productInfoList) {
				if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
					ProductInfoVO productInfoVO = new ProductInfoVO();
					BeanUtils.copyProperties(productInfo, productInfoVO);
					  productInfoVOList.add(productInfoVO);
				}
			}
			productVO.setProductInfoVOList(productInfoVOList);
			productVOList.add(productVO);
			
		}
		
	
		return ResultVOUtil.success(productVOList);

	   
   }
	@RequestMapping("/error")
	public ResultVO error(){
		return ResultVOUtil.success(new Object());
	}
	
} 

package club.twxit.dataobject;

import java.math.BigDecimal;

import javax.persistence.Id;

/**
 * ��Ʒ
 * @author Lenovo
 *
 */
public class ProductInfo {
  @Id
  private String productId;
  private String productName;
  private BigDecimal productPrice;
  private Integer productStock;
  private String productDescription;
  private String productIcon;
  private Integer productStatus;
  private String categoryType;
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public BigDecimal getProductPrice() {
	return productPrice;
}
public void setProductPrice(BigDecimal productPrice) {
	this.productPrice = productPrice;
}
public Integer getProductStock() {
	return productStock;
}
public void setProductStock(Integer productStock) {
	this.productStock = productStock;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public String getProductIcon() {
	return productIcon;
}
public void setProductIcon(String productIcon) {
	this.productIcon = productIcon;
}
public Integer getProductStatus() {
	return productStatus;
}
public void setProductStatus(Integer productStatus) {
	this.productStatus = productStatus;
}
public String getCategoryType() {
	return categoryType;
}
public void setCategoryType(String categoryType) {
	this.categoryType = categoryType;
}
  
}

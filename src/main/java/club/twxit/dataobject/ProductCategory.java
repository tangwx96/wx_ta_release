package club.twxit.dataobject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;



@Table(name = "product_category")
@Entity
@DynamicUpdate
public class ProductCategory {
	@Id
	@GeneratedValue
   private Integer categoryId;  //类目ID;
   public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getCategoryType() {
		return categoryType;
	}
	
	
    private Date createTime;

    private Date updateTime;
    
    
	@Override
	public String toString() {
		return "ProductCategory [categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", categoryType=" + categoryType + "]";
	}
	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}
private  String categoryName; //类目名字;
   private  Integer categoryType; //类目编号;
}

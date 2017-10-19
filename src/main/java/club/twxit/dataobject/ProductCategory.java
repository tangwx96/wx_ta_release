package club.twxit.dataobject;

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
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryType() {
		return categoryType;
	}
	@Override
	public String toString() {
		return "ProductCategory [categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", categoryType=" + categoryType + "]";
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
private  String categoryName; //类目名字;
   private  String categoryType; //类目编号;
}

package entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="productid",nullable=false)
	private int productid;
	
	@Column(name="productname",nullable=false)
	private String productname;
	
	@Column(name="productkind",nullable=false)
	private String productkind;
	
	@Column(name="productprice")
	private int productprice;
	
	@Column(name="artistsid")
	private int artistsid;
	
	@Column(name="productInformation")
	private String productInformation;

	public void setId(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductkind() {
		return productkind;
	}

	public void setProductkind(String productkind) {
		this.productkind = productkind;
	}

	public int getProductPrice() {
		return productprice;
	}

	public void setProductPrice(int productPrice) {
		this.productprice = productPrice;
	}

	public int getArtistsid() {
		return artistsid;
	}

	public void setArtistsid(int artistsid) {
		this.artistsid = artistsid;
	}

	public String getProductInformation() {
		return productInformation;
	}

	public void setProductInformation(String productInformation) {
		this.productInformation = productInformation;
	}

	public int getId() {
		return productid;
	}


}

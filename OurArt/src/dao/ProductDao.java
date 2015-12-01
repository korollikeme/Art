package dao;

import java.util.List;
import entity.Product;

public interface ProductDao {
	public void deleteById(int productid);
	public List<Product> getAllProduct();
	public void save(Product product);
	public void update(Product product);
	public Product getProductByname(String Productname);
	
}

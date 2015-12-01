package controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import dao.ProductDao;
import entity.Product;

@Controller
@RequestMapping("/product")
public class PurchaseController {
	@Resource
	private ProductDao productDao;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveProduct1(HttpServletRequest request,
			ModelMap model){
		int productid =  Integer.valueOf(request.getParameter("productid"));
		String productname = request.getParameter("productname");
		String productkind = request.getParameter("productkind");
		int productprice =  Integer.valueOf(request.getParameter("productprice"));
		String productInformation = request.getParameter("productInformation");
		int artistsid =  Integer.valueOf(request.getParameter("artistsid"));
	
		Product product = new Product();
		product.setArtistsid(artistsid);
		product.setProductPrice(productprice);
		product.setProductkind(productkind);
		product.setProductInformation(productInformation);
		product.setProductname(productname);
		productDao.save(product);
		return new ModelAndView("redirect:/product.html");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listAllProduct(){
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("product_list", productDao.getAllProduct());
		return new ModelAndView("productList",model);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView addProduct(@ModelAttribute("product") Product product,
			BindingResult result){
		return new ModelAndView("addproduct");
	}
	
	
	@RequestMapping(value="/del",method=RequestMethod.GET)
	public ModelAndView delProduct(@ModelAttribute("product") Product product){
		productDao.deleteById(product.getId());		
		return new ModelAndView("redirect:/product.html");
	}
}

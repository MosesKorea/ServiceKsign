package com.ksign.service.product;

import java.util.List;

public class ProductServiceImpl implements ProductService{
	ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public boolean createProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product readProduct(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> selectpTypeProduct(int p_type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

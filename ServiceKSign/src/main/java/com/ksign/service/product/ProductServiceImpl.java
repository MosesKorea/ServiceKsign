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
		return productDao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return productDao.updateProduct(product);
	}

	@Override
	public Product readProduct(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return productDao.readProduct(p_no);
	}

	@Override
	public boolean deleteProduct(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(p_no);
	}

	@Override
	public List<Product> selectpTypeProduct(int p_type) throws Exception {
		// TODO Auto-generated method stub
		return productDao.selectpTypeProduct(p_type);
	}

}

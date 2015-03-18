package com.ksign.service.product;

import java.util.List;

public interface ProductService {
	/**
	 * 제품정보 생성
	 * @param product
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createProduct(Product product) throws Exception;
	/**
	 * 제품 정보 수정
	 * @param product
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateProduct(Product product) throws Exception;
	/**
	 * 제품 정보 읽기
	 * @param p_no
	 * @return
	 * @throws Exception
	 */
	public abstract Product readProduct(int p_no) throws Exception;
	/**
	 * 제품 정보 삭제
	 * @param p_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deleteProduct(int p_no) throws Exception;
	
	/**
	 * 제품 타입에 따른 리스트 반환
	 * @param p_type
	 * @return
	 * @throws Exception
	 */
	public abstract List<Product> selectpTypeProduct(int p_type) throws Exception;
}

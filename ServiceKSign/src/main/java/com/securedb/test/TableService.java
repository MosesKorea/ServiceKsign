package com.securedb.test;

import java.util.List;

public interface TableService {
	
	/*
	 * Table에 새로운게시물생성
	 */
	public abstract boolean create() throws Exception;
	public abstract boolean create_en(List<Table> tables) throws Exception;
	public abstract boolean create_de(List<Table> tables) throws Exception;

	/*
	 * 기존?�� Table?�� ?��?��
	 */
	public abstract boolean update(Table table) throws Exception;
	public abstract boolean update_en(Table table) throws Exception;
	public abstract boolean update_de(Table table) throws Exception;
	/*
	 * ?��?���? 보기
	 */
	public abstract Table select(int teableSeq) throws Exception;
	public abstract Table select_en(int teableSeq) throws Exception;
	public abstract Table select_de(int teableSeq) throws Exception;

	/*
	 * ?��?��블번?��?�� ?��?��?��?�� ?��?���? ?��?��
	 */
	public abstract boolean remove(int teableSeq) throws Exception;
	public abstract boolean remove_en(int teableSeq) throws Exception;
	public abstract boolean remove_de(int teableSeq) throws Exception;
	
	public abstract boolean deleteAll() throws Exception;
	public abstract boolean deleteAll_en() throws Exception;
	public abstract boolean deleteAll_de() throws Exception;

	/*
	 * seq number?��?��?��?��?�� ?��보�?? ?��?��??베이?��?��?�� 찾아?��
	 * Table ?��메인?��?��?��?�� ???��?��?�� 반환
	 */
	public abstract List<Table> selectAll() throws Exception;
	public abstract List<Table> selectAll_en() throws Exception;
	public abstract List<Table> selectAll_de() throws Exception;
	/*
	 * ?��?���? ?��보�?? ?��?��??베이?��?��?�� 찾아?�� 
	 * List<Table> 콜렉?�� ?�� ???��?��?�� 반환
	 */
	public abstract List<Table> encryptAll() throws Exception;
	/*
	 * ?��?���? ?��보�?? ?��?��??베이?��?��?�� 찾아?�� 
	 * List<Table> 콜렉?�� ?�� ???��?��?�� 반환
	 */
	public abstract List<Table> decryptAll() throws Exception;

}

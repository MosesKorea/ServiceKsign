package com.securedb.test;

import java.sql.Connection;

import com.securedb.conpool.ConnectionPool;
/*
 * - DAO ��  �������� ������ Ŭ����
 * - ��� DAOŬ�������� ��ӹ޴´�..
 */
public class RdbmsDao {
	public Connection getConnection() throws Exception{
		return ConnectionPool.getInstance().getConnection();
		
	}
	public void releaseConnection(Connection con) throws Exception {
		ConnectionPool.getInstance().releaseConnection(con);
	}

}
package com.ksign.service.conpool;

import java.sql.Connection;

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
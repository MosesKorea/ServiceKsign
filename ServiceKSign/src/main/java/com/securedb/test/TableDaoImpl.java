package com.securedb.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class TableDaoImpl extends RdbmsDao implements TableDao {
	public final static String namespace="com.securedb.test.TableMapper";
	private SqlSession session;
	public SqlSession getSession() {
		return session;
	}
	
	public void setSession(SqlSession session) {
		System.out.println("#### UserDaoImplMyBatis() : setSession()");
		this.session = session;
	}
	
	public boolean create() throws Exception {
		boolean isSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			//Connection 얻기
			con=getConnection();
			int c=1;
			String jumin="1234567890123";
			String juso="주소주소주소주소주소주소주소주소주소주소";
			String insertSql="insert into test_table(seq,jumin,juso)"
					+ " values(?,?,?)";
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(insertSql);
			for (int j = 0; j < 100; j++) {
				for (int i = 0; i < 1000; i++) {
					pstmt.setInt(1, c);
					pstmt.setString(2, jumin);
					pstmt.setString(3, juso);
					pstmt.addBatch();
					c++;
				}
				pstmt.executeBatch();
				con.commit();
			}
			
		    isSuccess=true;
		    
		}catch(Exception e){
			con.rollback(); // 에러발생시 rollback
			e.printStackTrace();
		}finally{
			if(pstmt!=null)pstmt.close();
			//Connection 반납
			if(con!=null)releaseConnection(con);
		}
		return isSuccess;
	}

	
	public boolean create_en(List<Table> tables) throws Exception {
		boolean isSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String insertSql="insert into test_table_en(seq,jumin,juso)"
						+ " values(?,?,?)";
		try{
			//Connection 얻기
			con=getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(insertSql);
			int index=0;
			for (int j = 0; j < 100; j++) {
				for (int i = 0; i < 1000; i++) {
					pstmt.setInt(1, tables.get(index).getSeq());
					pstmt.setString(2, tables.get(index).getJumin());
					pstmt.setString(3, tables.get(index).getJuso());
					pstmt.addBatch();
					index++;
				}
				pstmt.executeBatch();
				con.commit();
			}
		    isSuccess=true;
		}finally{
			if(pstmt!=null)pstmt.close();
			//Connection 반납
			if(con!=null)
			releaseConnection(con);
		}
		return isSuccess;
	}
	
	public boolean create_de(List<Table> tables) throws Exception {
		boolean isSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String insertSql="insert into test_table_de(seq,jumin,juso)"
						+ " values(?,?,?)";
		try{
			//Connection 얻기
			con=getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(insertSql);
			int index=0;
			for (int j = 0; j < 100; j++) {
				for (int i = 0; i < 1000; i++) {
					pstmt.setInt(1, tables.get(index).getSeq());
					pstmt.setString(2, tables.get(index).getJumin());
					pstmt.setString(3, tables.get(index).getJuso());
					pstmt.addBatch();
					index++;
				}
				pstmt.executeBatch();
				con.commit();
			}
		    isSuccess=true;
		}finally{
			if(pstmt!=null)pstmt.close();
			//Connection 반납
			if(con!=null)
			releaseConnection(con);
		}
		return isSuccess;
	}

	
	
	public boolean update(Table table) throws Exception {
		boolean iSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String updateSql="update test_table set jumin=?"
				+ " where seq=? ";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(updateSql);
			con.setAutoCommit(false);
			for (int j = 0; j < 100; j++) {
				for (int i = 0; i < 1000; i++) {
					pstmt.setString(1, table.getJumin());
					pstmt.setInt(2, table.getSeq());
					pstmt.addBatch();
				}
				pstmt.executeBatch();
				con.commit();
			}
		    iSuccess=true;
			
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return iSuccess;
	}
	
	
	public boolean update_en(Table table) throws Exception {
		boolean iSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String updateSql="update test_table_en set jumin=?"
				+ " where seq=? ";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(updateSql);
			con.setAutoCommit(false);
			for (int j = 0; j < 100; j++) {
				for (int i = 0; i < 1000; i++) {
					pstmt.setString(1, table.getJumin());
					pstmt.setInt(2, table.getSeq());
					pstmt.addBatch();
				}
				pstmt.executeBatch();
				con.commit();
			}
		    iSuccess=true;
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return iSuccess;
	}

	
	public boolean update_de(Table table) throws Exception {
		boolean iSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String updateSql="update test_table_de set jumin=?"
				+ " where seq=? ";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(updateSql);
			con.setAutoCommit(false);
			for (int j = 0; j < 100; j++) {
				for (int i = 0; i < 1000; i++) {
					pstmt.setString(1, table.getJumin());
					pstmt.setInt(2, table.getSeq());
					pstmt.addBatch();
				}
				pstmt.executeBatch();
				con.commit();
			}
		    iSuccess=true;
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return iSuccess;
	}

	
	public Table select(int teableSeq) throws Exception {
		Table table=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso "
						+ "from test_table where seq=?";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(selectSql);
			pstmt.setInt(1, teableSeq);
			rs=pstmt.executeQuery();
			if(rs.next()){
				table=
						new Table(rs.getInt("seq"),
								 rs.getString("jumin"),
								 rs.getString("juso")
									 );
			}
			
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return table;
	}
	
	public Table select_en(int teableSeq) throws Exception {
		Table table=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso "
						+ "from test_table_en where seq=?";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(selectSql);
			pstmt.setInt(1, teableSeq);
			rs=pstmt.executeQuery();
			if(rs.next()){
				table=
						new Table(rs.getInt("seq"),
								 rs.getString("jumin"),
								 rs.getString("juso")
									 );
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return table;
	}

	
	public Table select_de(int teableSeq) throws Exception {
		Table table=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso "
						+ "from test_table_de where seq=?";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(selectSql);
			pstmt.setInt(1, teableSeq);
			rs=pstmt.executeQuery();
			if(rs.next()){
				table=
						new Table(rs.getInt("seq"),
								 rs.getString("jumin"),
								 rs.getString("juso")
									 );
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return table;
	}

	
	public boolean remove(int tableSeq) throws Exception {
		boolean isSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String deleteSql="delete from test_table where seq=?";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(deleteSql);
			pstmt.setInt(1, tableSeq);
			pstmt.executeUpdate();
			isSuccess=true;
			
		}catch(Throwable e){
			isSuccess=false;
			e.printStackTrace();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null){
				try {
					releaseConnection(con);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return isSuccess;
	}
	
	
	public boolean remove_en(int tableSeq) throws Exception {
		boolean isSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String deleteSql="delete from test_table_en where seq=?";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(deleteSql);
			pstmt.setInt(1, tableSeq);
			pstmt.executeUpdate();
			isSuccess=true;
		}catch(Throwable e){
			isSuccess=false;
			e.printStackTrace();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null){
				try {
					releaseConnection(con);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return isSuccess;
	}

	
	public boolean remove_de(int tableSeq) throws Exception {
		boolean isSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String deleteSql="delete from test_table_de where seq=?";
		try{
			con=getConnection();
			pstmt=con.prepareStatement(deleteSql);
			pstmt.setInt(1, tableSeq);
			pstmt.executeUpdate();
			isSuccess=true;
		}catch(Throwable e){
			isSuccess=false;
			e.printStackTrace();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null){
				try {
					releaseConnection(con);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return isSuccess;
	}

	
	public List<Table> selectAll() throws Exception {
		ArrayList<Table> tableList=new ArrayList<Table>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso from test_table";
		try{
			con=this.getConnection();
			pstmt=con.prepareStatement(selectSql);
			rs=pstmt.executeQuery();
			rs.setFetchSize(10000);
			while (rs.next()) {
				tableList.add(new Table(rs.getInt("seq"),
										 rs.getString("jumin"),
										 rs.getString("juso")
											 )
								);
			}
			
			
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null){
				this.releaseConnection(con);
			}
		}
		return tableList;
	}
	
	
	public List<Table> selectAll_en() throws Exception {
		ArrayList<Table> tableList=new ArrayList<Table>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso from test_table_en";
		try{
			con=this.getConnection();
			pstmt=con.prepareStatement(selectSql);
			rs=pstmt.executeQuery();
			rs.setFetchSize(10000);
			while (rs.next()) {
				tableList.add(new Table(rs.getInt("seq"),
										 rs.getString("jumin"),
										 rs.getString("juso")
											 )
								);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null){
				this.releaseConnection(con);
			}
		}
		return tableList;
	}

	
	public List<Table> selectAll_de() throws Exception {
		ArrayList<Table> tableList=new ArrayList<Table>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso from test_table_de";
		try{
			con=this.getConnection();
			pstmt=con.prepareStatement(selectSql);
			rs=pstmt.executeQuery();
			rs.setFetchSize(10000);
			while (rs.next()) {
				tableList.add(new Table(rs.getInt("seq"),
										 rs.getString("jumin"),
										 rs.getString("juso")
											 )
								);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null){
				this.releaseConnection(con);
			}
		}
		return tableList;
	}

	
	public List<Table> encryptAll() throws Exception {
		ArrayList<Table> tableList=new ArrayList<Table>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso from test_table";
		try{
			con=this.getConnection();
			pstmt=con.prepareStatement(selectSql);
			rs=pstmt.executeQuery();
			rs.setFetchSize(10000);
			while (rs.next()) {
				tableList.add(new Table(rs.getInt("seq"),
										 rs.getString("jumin"),
										 rs.getString("juso")
											 )
								);
			}
			
		}finally{
			if(con!=null){
				this.releaseConnection(con);
			}
		}
		return tableList;
	}

	
	public List<Table> decryptAll() throws Exception {
		ArrayList<Table> tableList=new ArrayList<Table>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectSql="select seq,jumin,juso from test_table";
		try{
			con=this.getConnection();
			pstmt=con.prepareStatement(selectSql);
			rs=pstmt.executeQuery();
			rs.setFetchSize(10000);
			while (rs.next()) {
				tableList.add(new Table(rs.getInt("seq"),
										 rs.getString("jumin"),
										 rs.getString("juso")
											 )
								);
			}
		}finally{
			if(con!=null){
				this.releaseConnection(con);
			}
		}
		return tableList;
	}

	@Override
	public boolean deleteAll() throws Exception {
		String deleteSql="delete test_table"; 
		boolean iSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=getConnection();
			pstmt=con.prepareStatement(deleteSql);
			pstmt.executeUpdate();
			iSuccess=true;
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return iSuccess;
	}

	@Override
	public boolean deleteAll_en() throws Exception {
		// TODO Auto-generated method stub
		String deleteSql="delete test_table_en"; 
		boolean iSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=getConnection();
			pstmt=con.prepareStatement(deleteSql);
			pstmt.executeUpdate();
		    iSuccess=true;
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return iSuccess; 
		
	}

	@Override
	public boolean deleteAll_de() throws Exception {
		// TODO Auto-generated method stub
		String deleteSql="delete test_table_de"; 
		boolean iSuccess=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=getConnection();
			pstmt=con.prepareStatement(deleteSql);
			pstmt.executeUpdate();
		    iSuccess=true;
		}finally{
			if(pstmt!=null)pstmt.close();
			if(con!=null)releaseConnection(con);
		}
		return iSuccess; 
	}

	
	

	

	

	

}

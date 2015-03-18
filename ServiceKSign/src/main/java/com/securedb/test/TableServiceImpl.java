package com.securedb.test;

import java.util.List;

public class TableServiceImpl implements TableService{
	private TableDao tableDao;
	
		public TableDao getTableDao() {
		return tableDao;
	}

	public void setTableDao(TableDao tableDao) {
		this.tableDao = tableDao;
	}

	
	public boolean create() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.create();
	}
	
	public boolean create_en(List<Table> table) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.create_en(table);
	}
	
	public boolean create_de(List<Table> table) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.create_de(table);
	}

	
	public boolean update(Table table) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.update(table);
	}
	
	public boolean update_en(Table table) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.update_en(table);
	}
	
	public boolean update_de(Table table) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.update_de(table);
	}

	
	public Table select(int teableSeq) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.select(teableSeq);
	}
	
	public Table select_de(int teableSeq) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.select_de(teableSeq);
	}
	
	public Table select_en(int teableSeq) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.select_en(teableSeq);
	}

	
	public boolean remove(int teableSeq) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.remove(teableSeq);
	}
	
	public boolean remove_en(int teableSeq) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.remove_en(teableSeq);
	}
	
	public boolean remove_de(int teableSeq) throws Exception {
		// TODO Auto-generated method stub
		return tableDao.remove_de(teableSeq);
	}

	
	public List<Table> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.selectAll();
	}
	public List<Table> selectAll_en() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.selectAll_en();
	}
	
	public List<Table> selectAll_de() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.selectAll_de();
	}

	
	public List<Table> encryptAll() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.encryptAll();
	}

	
	public List<Table> decryptAll() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.decryptAll();
	}

	@Override
	public boolean deleteAll() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.deleteAll();
	}

	@Override
	public boolean deleteAll_en() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.deleteAll_en();
	}

	@Override
	public boolean deleteAll_de() throws Exception {
		// TODO Auto-generated method stub
		return tableDao.deleteAll_de();
	}

}

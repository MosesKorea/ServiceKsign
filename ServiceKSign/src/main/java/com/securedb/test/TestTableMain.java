package com.securedb.test;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ksign.api.SDBFramework;

public class TestTableMain {
	public static void main(String[] args) throws Exception {
		System.out.println("--------------------ApplicationContext 초기화 전-------------------");
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("spring/business-config-mybatis.xml");
		System.out.println("--------------------ApplicationContext 초기화 후-------------------");
		TableService tableService = (TableService)applicationContext.getBean("tableService");
		//BufferedReader inputInfo = new BufferedReader(new InputStreamReader(System.in));
		//1 : 데이터 입력, 2: 암호화 복호화, 3: 데이터삭제
		System.out.println("productCode 상태 --------------------    < 1 : 데이터 입력, 2: 암호화 복호화, 3: 데이터삭제,  4: 일괄처리 >");
		System.out.println("productCode를 입력하시오 :");
		String productCode="3"/*inputInfo.readLine()*/;
		
		if (productCode.equals("1")||productCode=="1") {
			//평문입력
		  
		  	try 
			{
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.create();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("평문데이터 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				// TODO 평문데이터 입력
				e.printStackTrace();
			}
			
			
		} else if (productCode.equals("2")||productCode=="2"){

			List<Table> tables=null;
			long totalStartTime =  System.currentTimeMillis();//출력된 시간부분
			//평문뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("평문데이터 출력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				// TODO 평문데이터 출력
				e.printStackTrace();
			}
			
			//암호화입력	
			try {
				Table table=null;
				List<Table> listTable=new ArrayList<Table>();;
				long startTime = System.currentTimeMillis();//입력된 시간부분
				for (Table table2 : tables) {//.SDB_ENC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null)
					table = new Table(table2.getSeq(), SDBFramework.SDB_ENC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null), table2.getJuso());
//					table = new Table(table2.getSeq(), SDBCrypto.encryptCEV("DBSECAG", "M_KEY", "PAR", table2.getJumin()), table2.getJuso());
					listTable.add(table);
				}
				boolean b=tableService.create_en(listTable);
				System.out.println(b);
				long endTime = System.currentTimeMillis();//입력 끝난시간
				System.out.println("암호화해서 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
			} catch (Exception e) {
				// TODO 암호화해서 입력
				e.printStackTrace();
			}
			
			//암호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("암호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				// TODO 암호화해서 출력
				e.printStackTrace();
			}
			
			//복호화입력	
			try {
				Table table=null;
				List<Table> listTable=new ArrayList<Table>();
				long startTime = System.currentTimeMillis();//입력된 시간부분
				for (Table table2 : tables) {//SDBFramework.SDB_DEC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null) SDBCrypto.decryptCEV("dbsecag", "m_key", "par", table2.getJumin())
					table = new Table(table2.getSeq(), SDBFramework.SDB_DEC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null), table2.getJuso());
//					table = new Table(table2.getSeq(), SDBCrypto.decryptCEV("DBSECAG", "M_KEY", "PAR", table2.getJumin()), table2.getJuso());
					listTable.add(table);
				}
				boolean b=tableService.create_de(listTable);
				System.out.println(b);
				long endTime = System.currentTimeMillis();//입력 끝난시간
				System.out.println("복호화해서 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
			} catch (Exception e) {
				// TODO 복호화해서 입력
				e.printStackTrace();
			}
			
			//암호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("복호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				// TODO 암호화뽑기
				e.printStackTrace();
			}
			
			
			long totalEndTime =  System.currentTimeMillis();//출력 끝난시간
			System.out.println("암호화 출력시 실행 시간 [{"+((float)(totalEndTime-totalStartTime))/1000.0+"초 }]");
		}else if(productCode.equals("3")||productCode=="3"){
			
			
			
			//평문 테이블삭제 
			
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.deleteAll();
				System.out.println();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("삭제 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				// TODO 평문 삭제실행
				e.printStackTrace();
			}
			 
			
			//암호화 테이블삭제 
			
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.deleteAll_en();
				System.out.println();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("삭제 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				// TODO 암호화테이블 삭제
				e.printStackTrace();
			}
			
			
			//복호화 테이블삭제 
			
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.deleteAll_de();
				System.out.println();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("삭제 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				// TODO 복호화테이블 삭제
				e.printStackTrace();
			}
			
			
		}else if(productCode.equals("4")||productCode=="4"){
			
			long totalStartTime =  System.currentTimeMillis();//출력된 시간부분
			  
			//평문입력
		  	try 
			{
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.create();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("평문데이터 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		  	
		  	
		  	List<Table> tables=null;
			//평문뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("평문데이터 출력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//암호화입력	
			try {
				Table table=null;
				List<Table> listTable=new ArrayList<Table>();;
				long startTime = System.currentTimeMillis();//입력된 시간부분
				for (Table table2 : tables) {//.SDB_ENC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null)
					table = new Table(table2.getSeq(), SDBFramework.SDB_ENC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null), table2.getJuso());
//					table = new Table(table2.getSeq(), SDBCrypto.encryptCEV("DBSECAG", "M_KEY", "PAR", table2.getJumin()), table2.getJuso());
					listTable.add(table);
				}
				boolean b=tableService.create_en(listTable);
				System.out.println(b);
				long endTime = System.currentTimeMillis();//입력 끝난시간
				System.out.println("암호화해서 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//암호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("암호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//복호화입력	
			try {
				Table table=null;
				List<Table> listTable=new ArrayList<Table>();
				long startTime = System.currentTimeMillis();//입력된 시간부분
				for (Table table2 : tables) {//SDBFramework.SDB_DEC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null) SDBCrypto.decryptCEV("dbsecag", "m_key", "par", table2.getJumin())
					table = new Table(table2.getSeq(), SDBFramework.SDB_DEC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null), table2.getJuso());
//					table = new Table(table2.getSeq(), SDBCrypto.decryptCEV("DBSECAG", "M_KEY", "PAR", table2.getJumin()), table2.getJuso());
					listTable.add(table);
				}
				boolean b=tableService.create_de(listTable);
				System.out.println(b);
				long endTime = System.currentTimeMillis();//입력 끝난시간
				System.out.println("복호화해서 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//암호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("복호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			long totalEndTime =  System.currentTimeMillis();//출력 끝난시간
			System.out.println("TOTAL 실행 시간 [{"+((float)(totalEndTime-totalStartTime))/1000.0+"초 }]");
		  	
			
		}
		 
		 
		 
	}

}

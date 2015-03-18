package com.securedb.test.controller;


import java.util.ArrayList;
import java.util.List;
import ksign.api.SDBFramework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.ksign.securedb.api.SDBCrypto;
import com.securedb.test.Table;
import com.securedb.test.TableService;



@Controller
public class TableListController {
	
	TableService tableService;

	public TableService getTableService() {
		return tableService;
	}

	public void setTableService(TableService tableService) {
		this.tableService = tableService;
	}

	public TableListController() {
		System.out.println("### TableListController()생성자");
		
	}
	
	@RequestMapping(value="/testprocess",method=RequestMethod.GET)
	public String listForm(Model model, @RequestParam(value="codeNum")String codeNum) throws Exception{
		
		System.out.println("codeNum :"+codeNum);
		Double selectResultTime=0.0;
		Double selectEnResultTime=0.0;
		Double selectDeResultTime=0.0;
		Double insertResultTime=0.0;
		Double insertEnResultTime=0.0;
		Double insertDeResultTime=0.0;
		Double deleteResultTime=0.0;
		Double deleteEnResultTime=0.0;
		Double deleteDeResultTime=0.0;
		Double totalResultTime=0.0;
		if (codeNum.equals("1")||codeNum=="1") {
			//평문입력
			// TODO 평문데이터 입력
		  
		  	try 
			{
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.create();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("평문데이터 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				insertDeResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} else if (codeNum.equals("2")||codeNum=="2"){
			// TODO 2번 실행
			List<Table> tables=null;
			long totalStartTime =  System.currentTimeMillis();//출력된 시간부분
			//평문뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("평문데이터 출력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				selectResultTime=(Double)(((float)(endTime-startTime))/1000.0);
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
				insertEnResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//암호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("암호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				selectEnResultTime=(Double)(((float)(endTime-startTime))/1000.0);
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
				insertDeResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//복호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("복호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				selectDeResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			long totalEndTime =  System.currentTimeMillis();//출력 끝난시간
			System.out.println("암호화 출력시 실행 시간 [{"+((float)(totalEndTime-totalStartTime))/1000.0+"초 }]");
		    totalResultTime=(Double)(((float)(totalEndTime-totalStartTime))/1000.0);
			
		}else if(codeNum.equals("3")||codeNum=="3"){
			//TODO 일괄삭제
			
			
			//평문 테이블삭제 
			
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.deleteAll();
				System.out.println();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("삭제 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				deleteResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			 
			
			//암호화 테이블삭제 
			
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.deleteAll_en();
				System.out.println();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("삭제 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				deleteEnResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//복호화 테이블삭제 
			
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.deleteAll_de();
				System.out.println();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("삭제 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				deleteDeResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}else if(codeNum.equals("4")||codeNum=="4"){
			//TODO 일괄처리
			long totalStartTime =  System.currentTimeMillis();//출력된 시간부분
			  
			//평문입력
			try 
			{
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tableService.create();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("평문데이터 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				insertResultTime=(Double)(((float)(endTime-startTime))/1000.0);
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
				selectResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//암호화입력	
			try {
				Table table=null;
				List<Table> listTable=new ArrayList<Table>();;
				long startTime = System.currentTimeMillis();//입력된 시간부분
				for (Table table2 : tables) {
					//.SDB_ENC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null)
//					table = new Table(table2.getSeq(), SDBFramework.SDB_ENC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null), table2.getJuso());
					table = new Table(table2.getSeq(), SDBCrypto.encryptCEV("DBSECAG", "M_KEY", "PAR", table2.getJumin()), table2.getJuso());
					listTable.add(table);
				}
				boolean b=tableService.create_en(listTable);
				System.out.println(b);
				long endTime = System.currentTimeMillis();//입력 끝난시간
				System.out.println("암호화해서 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				insertEnResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//암호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("암호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				selectEnResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//복호화입력	
			try {
				Table table=null;
				List<Table> listTable=new ArrayList<Table>();
				long startTime = System.currentTimeMillis();//입력된 시간부분
				for (Table table2 : tables) {//SDBFramework.SDB_DEC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null) SDBCrypto.decryptCEV("dbsecag", "m_key", "par", table2.getJumin())
//					table = new Table(table2.getSeq(), SDBFramework.SDB_DEC(table2.getJumin(), "DBSECAG.M_KEY.PAR", "AGC", 1, null), table2.getJuso());
					table = new Table(table2.getSeq(), SDBCrypto.decryptCEV("DBSECAG", "M_KEY", "PAR", table2.getJumin()), table2.getJuso());
					listTable.add(table);
				}
				boolean b=tableService.create_de(listTable);
				System.out.println(b);
				long endTime = System.currentTimeMillis();//입력 끝난시간
				System.out.println("복호화해서 입력 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				insertDeResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//암호화뽑기
			try {
				long startTime =  System.currentTimeMillis();//출력된 시간부분
				tables=tableService.selectAll_en();
				long endTime =  System.currentTimeMillis();//출력 끝난시간
				System.out.println("복호화 출력시 실행 시간 [{"+((float)(endTime-startTime))/1000.0+"초 }]");
				selectDeResultTime=(Double)(((float)(endTime-startTime))/1000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			long totalEndTime =  System.currentTimeMillis();//출력 끝난시간
			System.out.println("TOTAL 실행 시간 [{"+((float)(totalEndTime-totalStartTime))/1000.0+"초 }]");
		  	totalResultTime=(Double)(((float)(totalEndTime-totalStartTime))/1000.0);
			
		}
				
				model.addAttribute("insertResultTime",insertResultTime);
				model.addAttribute("insertEnResultTime",insertEnResultTime);
				model.addAttribute("insertDeResultTime",insertDeResultTime);
				model.addAttribute("selectResultTime",selectResultTime);
				model.addAttribute("selectEnResultTime",selectEnResultTime);
				model.addAttribute("selectDeResultTime",selectDeResultTime);
				model.addAttribute("selectDeResultTime",selectDeResultTime);
				model.addAttribute("deleteResultTime",deleteResultTime);
				model.addAttribute("deleteEnResultTime",deleteEnResultTime);
				model.addAttribute("deleteDeResultTime",deleteDeResultTime);
				model.addAttribute("totalResultTime",totalResultTime);
				
		
		return "test/testresult";
	}
	
	@RequestMapping(value="/encrypto",method=RequestMethod.GET,produces="text/plain;charset=utf-8")
	public String encrypto(			Model model, 
			@RequestParam(value="code",defaultValue="1")String code,
			@RequestParam(value="seq")String seq, 
			@RequestParam(value="jumin")String jumin,
			@RequestParam(value="juso")String juso) throws Exception{
		
		
		
		System.out.println("code : "+code);
		System.out.println("seq : "+seq);
		System.out.println("jumin : "+jumin);
		System.out.println("juso : "+juso);
		String resultJumin="";
		if (code.equals("1")||code=="1") {
			String enJumin=SDBFramework.SDB_ENC(jumin, "DBSECAG.M_KEY.PAR", "AGC", 1, null);
			System.out.println("code : "+code);
			System.out.println("seq : "+seq);
			System.out.println("jumin : "+enJumin);
			System.out.println("juso : "+juso);
			resultJumin=enJumin;
		} else if (code.equals("2")||code=="2") {
			String deJumin=SDBFramework.SDB_DEC(jumin, "DBSECAG.M_KEY.PAR", "AGC", 1, null);
			System.out.println("code : "+code);
			System.out.println("seq : "+seq);
			System.out.println("jumin : "+deJumin);
			System.out.println("juso : "+juso);
			resultJumin=deJumin;
		}
		
		
		
		
		
		
		
		model.addAttribute("seq", seq);
		model.addAttribute("jumin", resultJumin);
		model.addAttribute("juso", juso);
		
		return "test/encrypto";
	}
	
	
}

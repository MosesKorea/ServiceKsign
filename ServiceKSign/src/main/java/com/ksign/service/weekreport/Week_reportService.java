package com.ksign.service.weekreport;

import java.util.List;

public interface Week_reportService {
	/**
	 * 주간보고 정보 생성
	 * @param report
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createWeek_report(Week_report report) throws Exception;
	/**
	 * 	주간보고 정보 수정
	 * @param report
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateWeek_report(Week_report report) throws Exception;
	/**
	 * 주간보고 정보 읽기
	 * @param re_no
	 * @return
	 * @throws Exception
	 */
	public abstract Week_report readWeek_report(int re_no) throws Exception;
	/**
	 * 주간보고 정보 삭제
	 * @param re_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deleteWeek_report(int re_no) throws Exception;
	/**
	 * 주간보고 리스트 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Week_report> selectWeek_report() throws Exception;
	/**
	 * 작성자에 따른 주간보고 리스트 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Week_report> selectWriterWeek_report() throws Exception;
}

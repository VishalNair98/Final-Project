package com.cg.devops.service;

import com.cg.devops.beans.Report;

/**
 * 
 * @author Team1
 * @viewedBy Amit Kumar 
 * Service Interface ReportService for abstracting Service Implementations
 * 
 * 
 */
public interface ReportService {
	/**
	 * Method getReport of Service 
	 * @param language
	 * @return Report object
	 */
	public Report getReport(String language);

}

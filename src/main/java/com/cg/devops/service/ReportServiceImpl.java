package com.cg.devops.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.devops.beans.Report;
import com.cg.devops.beans.SeverityCount;
import com.cg.devops.beans.TypeCount;
import com.cg.devops.dao.ReportDao;

/**
 * 
 * @author Team1
 * @viewedBy Amit Kumar 
 * Service Implementation ReportServiceImpl for Service Logic Implementations
 */
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportDao reportdao;

	/**
	 * Method getReport of ServiceImpl
	 * @param takes String language Returns Object report
	 */
	@Override
	public Report getReport(final String language) {

		final Report report = new Report();
		report.setDate(LocalDate.now());


		report.setTypeCount(
				getTypeCount(language)
				);

		final SeverityCount severityCount = getSeverityCount(language);
		report.setSeverityCount(severityCount);

		return report;
	}

	/**
	 * Method getSeverityCount of ServiceImpl
	 * @param takes String language Returns Object severityCount
	 */
	private SeverityCount getSeverityCount(final String language) {
		final SeverityCount severityCount = new SeverityCount();

		final int minorCount = reportdao.getMinor(language);
		final int criticalCount = reportdao.getCritical(language);
		final int infoCount = reportdao.getInfo(language);
		final int majorCount = reportdao.getMajor(language);
		final int blockerCount = reportdao.getBlocker(language);

		severityCount.setMinorCount(minorCount);
		severityCount.setCriticalCount(criticalCount);
		severityCount.setInfoCount(infoCount);
		severityCount.setMajorCount(majorCount);
		severityCount.setBlockerCount(blockerCount);

		return severityCount;
	}

	/**
	 * Method getTypeCount of ServiceImpl
	 * @param takes String language Returns Object typeCount
	 */
	private TypeCount getTypeCount(final String language) {
		final TypeCount typeCount = new TypeCount();

		final int bugs = reportdao.getBugs(language);
		final int vulnerabilityCount = reportdao.getVulnerability(language);
		final int codeSmell = reportdao.getCodeSmell(language);
		final int securityHotspot = reportdao.getHotspot(language);

		typeCount.setBugsCount(bugs);
		typeCount.setVulnerabilityCount(vulnerabilityCount);
		typeCount.setCodeSmell(codeSmell);
		typeCount.setSecurityHotspot(securityHotspot);

		return typeCount;
	}

}

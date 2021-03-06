package com.przepisy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.przepisy.web.dao.Przepis;
import com.przepisy.web.dao.Report;
import com.przepisy.web.dao.ReportsDao;
import com.przepisy.web.dao.User;

@Service("reportsService")
public class ReportsService {

	private ReportsDao reportDao;

	@Autowired
	public void setReportDao(ReportsDao reportDao) {
		this.reportDao = reportDao;
	}

	public void createReport(Report report) {
		reportDao.create(report);

	}

	public List<Report> getReports() {
		return reportDao.getReports();
	}

	public Report getReport(int id) {
		return reportDao.getReport(id);
	}

	public void deleteReport(Report report) {
		reportDao.delete(report);
	}
	public List<Report> getReports(Przepis przepis){
		return reportDao.getReports(przepis);
	}
	public List<Report> getReports(User user){
		return reportDao.getReports(user);
	}
	public void deleteReports(Przepis przepis){
		List<Report> reports = getReports(przepis);
		for (Report report: reports) {
			deleteReport(report);
		}
	}
	public void deleteReports(User user){
		List<Report> reports = getReports(user);
		for (Report report: reports) {
			deleteReport(report);
		}
	}
}

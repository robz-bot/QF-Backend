/**
 * 
 */
package com.internal.Query_Forum.QF.ServiceImpl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internal.Query_Forum.QF.SequenceGenerator;
import com.internal.Query_Forum.QF.Dto.ReportRequest;
import com.internal.Query_Forum.QF.Entity.Report;
import com.internal.Query_Forum.QF.Entity.User;
import com.internal.Query_Forum.QF.Repository.ReportRepository;
import com.internal.Query_Forum.QF.Repository.UserRepository;
import com.internal.Query_Forum.QF.Service.ReportService;

/**
 * @author Robin
 *
 */
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	ReportRepository reportRepository;
	@Autowired
	SequenceGenerator sequenceGenerator;
	@Autowired
	UserRepository userRepository;

	@Override
	public ReportRequest newReport(ReportRequest reportRequest) {
		ReportRequest resultDto = new ReportRequest();

		Report report = new Report();
		report.setReason(reportRequest.getReason());
		report.setId(sequenceGenerator.generateSequence("report"));
		report.setPostId(reportRequest.getPostId());
		report.setUserId(reportRequest.getUserId());
		report.setCreatedOn(Instant.now());
		report.setUpdatedOn(Instant.now());
		resultDto.setSuccess(true);
		resultDto.setMessage("Report added successfully");

		reportRepository.save(report);

		return resultDto;
	}

	@Override
	public List<ReportRequest> getAllReports() {
		List<ReportRequest> resultDto = new ArrayList<ReportRequest>();

		List<Report> reportList = reportRepository.findAll();
		for (Report report : reportList) {
			resultDto.add(reports(report));
		}
		return resultDto;
	}

	private ReportRequest reports(Report report) {
		ReportRequest reportRequest = new ReportRequest();
		User user = userRepository.findById(report.getUserId()).orElse(null);
		
		if(user!=null) {
			reportRequest.setUserName(user.getUserName());
		}
		
		reportRequest.setCreatedOn(report.getCreatedOn());
		reportRequest.setId(report.getId());
		reportRequest.setUserId(report.getUserId());
		reportRequest.setPostId(report.getPostId());
		reportRequest.setReason(report.getReason());
		reportRequest.setUpdatedOn(report.getUpdatedOn());
		return null;
	}

}

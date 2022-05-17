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
import com.internal.Query_Forum.QF.Dto.ReportTypeRequest;
import com.internal.Query_Forum.QF.Entity.ReportType;
import com.internal.Query_Forum.QF.Repository.ReportTypeRepository;
import com.internal.Query_Forum.QF.Service.ReportTypeService;

/**
 * @author Robin
 *
 */
@Service
public class ReportTypeServiceImpl implements ReportTypeService {

	@Autowired
	ReportTypeRepository reportTypeRepository;

	@Autowired
	SequenceGenerator sequenceGenerator;

	@Override
	public ReportTypeRequest newReportType(ReportTypeRequest reportTypeRequest) {

		ReportTypeRequest resultDto = new ReportTypeRequest();

		ReportType reportType = new ReportType();

		reportType.setReport(reportTypeRequest.getReport());
		reportType.setCreatedOn(Instant.now());
		reportType.setUpdatedOn(Instant.now());
		reportType.setId(sequenceGenerator.generateSequence("report_type"));
		resultDto.setSuccess(true);
		resultDto.setMessage("Report type added successfully");

		reportTypeRepository.save(reportType);

		return resultDto;
	}

	@Override
	public List<ReportTypeRequest> getAllReportsType() {
		List<ReportTypeRequest> resultDto = new ArrayList<ReportTypeRequest>();

		List<ReportType> reportTypeList = reportTypeRepository.findAll();
		for (ReportType reportType : reportTypeList) {
			resultDto.add(reportsType(reportType));
		}
		return resultDto;
	}

	private ReportTypeRequest reportsType(ReportType reportType) {
		ReportTypeRequest reportTypeRequest = new ReportTypeRequest();
		reportTypeRequest.setCreatedOn(reportType.getCreatedOn());
		reportTypeRequest.setId(reportType.getId());
		reportTypeRequest.setReport(reportType.getReport());
		reportTypeRequest.setUpdatedOn(reportType.getUpdatedOn());
		return reportTypeRequest;
	}

}

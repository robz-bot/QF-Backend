/**
 * 
 */
package com.internal.Query_Forum.QF.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internal.Query_Forum.QF.Dto.ReportTypeRequest;
import com.internal.Query_Forum.QF.Service.ReportTypeService;

/**
 * @author Robin
 *
 */
@RequestMapping("api/report_type")
@RestController
@CrossOrigin("*")
public class ReportTypeController {

	@Autowired
	ReportTypeService reportTypeService;
	
	@PostMapping("/newReportType")
	public ReportTypeRequest newReportType(@RequestBody ReportTypeRequest reportTypeRequest) {
		ReportTypeRequest res = reportTypeService.newReportType(reportTypeRequest);
		return res;
	}

	@GetMapping("/")
	public List<ReportTypeRequest> allReportsType() {
		return reportTypeService.getAllReportsType();
	}
	
	
}

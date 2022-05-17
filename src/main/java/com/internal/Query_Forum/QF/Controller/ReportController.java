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

import com.internal.Query_Forum.QF.Dto.ReportRequest;
import com.internal.Query_Forum.QF.Service.ReportService;

/**
 * @author Robin
 *
 */
@RequestMapping("api/report")
@RestController
@CrossOrigin("*")
public class ReportController {

	@Autowired
	ReportService reportService;
	
	@PostMapping("/newReport")
	public ReportRequest newComment(@RequestBody ReportRequest reportRequest) {
		ReportRequest res = reportService.newReport(reportRequest);
		return res;
	}

	@GetMapping("/")
	public List<ReportRequest> allReports() {
		return reportService.getAllReports();
	}
	
	
}

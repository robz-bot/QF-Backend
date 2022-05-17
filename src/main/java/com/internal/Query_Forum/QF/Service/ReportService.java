/**
 * 
 */
package com.internal.Query_Forum.QF.Service;

import java.util.List;

import com.internal.Query_Forum.QF.Dto.ReportRequest;

/**
 * @author Robin
 *
 */
public interface ReportService {

	ReportRequest newReport(ReportRequest reportRequest);

	List<ReportRequest> getAllReports();

}

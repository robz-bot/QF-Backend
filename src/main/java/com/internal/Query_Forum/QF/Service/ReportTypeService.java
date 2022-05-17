/**
 * 
 */
package com.internal.Query_Forum.QF.Service;

import java.util.List;

import com.internal.Query_Forum.QF.Dto.ReportTypeRequest;

/**
 * @author Robin
 *
 */
public interface ReportTypeService {

	ReportTypeRequest newReportType(ReportTypeRequest reportTypeRequest);

	List<ReportTypeRequest> getAllReportsType();

	

}

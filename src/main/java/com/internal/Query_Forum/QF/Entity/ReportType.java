/**
 * 
 */
package com.internal.Query_Forum.QF.Entity;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Robin
 *
 */
@Document
public class ReportType {
	@Transient
	public static final String SEQUENCE_NAME = "report_type";

	@Id
	private Long id;
	private String report;
	private Instant createdOn;
	private Instant updatedOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Instant getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "ReportType [id=" + id + ", report=" + report + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
				+ "]";
	}

}

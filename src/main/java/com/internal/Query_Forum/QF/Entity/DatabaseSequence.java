/**
 * 
 */
package com.internal.Query_Forum.QF.Entity;

import org.springframework.data.annotation.Id;

/**
 * @author ROBIN RAJESH
 *
 */
public class DatabaseSequence {
	@Id
	private String sequenceName;

	private long seqenceNumber;

	/**
	 * @return the seq_num
	 */
	public long getSeq_num() {
		return seqenceNumber;
	}

	/**
	 * @param seq_num the seq_num to set
	 */
	public void setSeq_num(long seq_num) {
		this.seqenceNumber = seq_num;
	}

	/**
	 * @return the seq_name
	 */
	public String getSeq_name() {
		return sequenceName;
	}

	/**
	 * @param seq_name the seq_name to set
	 */
	public void setSeq_name(String seq_name) {
		this.sequenceName = seq_name;
	}

}

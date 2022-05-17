/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.internal.Query_Forum.QF.Entity.Report;

/**
 * @author Robin
 *
 */
public interface ReportRepository extends MongoRepository<Report, Long>{

}

/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.internal.Query_Forum.QF.Entity.ReportType;

/**
 * @author Robin
 *
 */
public interface ReportTypeRepository extends MongoRepository<ReportType, Long>{

}

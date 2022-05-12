/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.internal.Query_Forum.QF.Entity.VerficationToken;

/**
 * @author ROBIN RAJESH
 *
 */
@Repository
public interface VerficationTokenRepository extends MongoRepository<VerficationToken, Long>{

}

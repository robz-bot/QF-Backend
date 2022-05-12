/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.internal.Query_Forum.QF.Entity.DatabaseSequence;

/**
 * @author ROBIN RAJESH
 *
 */
public interface DatabaseSequenceRepository extends MongoRepository<DatabaseSequence, String> {

	DatabaseSequence findBySequenceName(String seqName);

	
}

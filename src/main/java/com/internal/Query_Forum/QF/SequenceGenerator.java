/**
 * 
 */
package com.internal.Query_Forum.QF;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internal.Query_Forum.QF.Entity.DatabaseSequence;
import com.internal.Query_Forum.QF.Repository.DatabaseSequenceRepository;

/**
 * @author ROBIN RAJESH
 *
 */
@Service
public class SequenceGenerator {
	@Autowired
	private DatabaseSequenceRepository databaseSequenceRepository;

	public Long generateSequence(String seqName) {

		DatabaseSequence findBySequenceName = databaseSequenceRepository.findBySequenceName(seqName);
		Long currentSequence = 0L;
		DatabaseSequence databaseSequence = new DatabaseSequence();
		if (findBySequenceName == null) {
			databaseSequence.setSeq_name(seqName);
			databaseSequence.setSeq_num(1);
			databaseSequenceRepository.save(databaseSequence);
			currentSequence = 1L;
		} else {			
			findBySequenceName.setSeq_num(findBySequenceName.getSeq_num() + 1);
			currentSequence = findBySequenceName.getSeq_num() + 1;
			databaseSequenceRepository.save(findBySequenceName);
		}

		return currentSequence;
	}
}

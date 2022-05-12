/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.internal.Query_Forum.QF.Entity.Vote;

/**
 * @author ROBIN RAJESH
 *
 */
@Repository
public interface VoteRepository extends MongoRepository<Vote, Long>{

	Vote findByPostIdAndUserId(Long postId, Long userId);

	Vote findByVoteType(String voteType);

	List<Vote> findByPostId(Long postId);

}

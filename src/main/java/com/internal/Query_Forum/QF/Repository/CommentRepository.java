/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.internal.Query_Forum.QF.Entity.Comment;

/**
 * @author ROBIN RAJESH
 *
 */
@Repository
public interface CommentRepository extends MongoRepository<Comment, Long>{

	List<Comment> findAllByPostId(Long postId);

	void deleteByPostId(Long id);

}

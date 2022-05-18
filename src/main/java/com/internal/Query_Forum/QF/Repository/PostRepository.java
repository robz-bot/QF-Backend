/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.internal.Query_Forum.QF.Entity.Post;

/**
 * @author ROBIN RAJESH
 *
 */
@Repository
public interface PostRepository extends MongoRepository<Post, Long>{

	List<Post> findAllByUserId(Long id);

	List<Post> findByCreatedOn(String date);

	List<Post> findAllByOrderByCreatedOnAsc();

	List<Post> findAllByOrderByCreatedOnDesc();

}

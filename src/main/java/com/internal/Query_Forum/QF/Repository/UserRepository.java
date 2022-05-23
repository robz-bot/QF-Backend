/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.internal.Query_Forum.QF.Entity.Post;
import com.internal.Query_Forum.QF.Entity.User;

/**
 * @author ROBIN RAJESH
 *
 */
@Repository
public interface UserRepository extends MongoRepository<User, Long>{

	Optional<User> findByUserName(String username);

	User findByEmail(String email);

	List<Post> findAllByIsActive(boolean active);

}

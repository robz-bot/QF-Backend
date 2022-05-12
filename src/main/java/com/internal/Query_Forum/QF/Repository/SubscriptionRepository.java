/**
 * 
 */
package com.internal.Query_Forum.QF.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.internal.Query_Forum.QF.Entity.Subscription;

/**
 * @author ROBIN RAJESH
 *
 */
@Repository
public interface SubscriptionRepository extends MongoRepository<Subscription, Long> {

}

/**
 * 
 */
package com.internal.Query_Forum.QF.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internal.Query_Forum.QF.Dto.VoteRequest;
import com.internal.Query_Forum.QF.Service.VoterService;

/**
 * @author ROBIN RAJESH
 *
 */
@RequestMapping("api/vote")
@RestController
@CrossOrigin("*")
public class VoteController {
	@Autowired
	VoterService voteService;

	

	@PostMapping("/postLikedByUser")
	public VoteRequest postLikedByUser(@RequestBody VoteRequest voteRequest) {
		return voteService.postLikedByUser(voteRequest);
	}

}

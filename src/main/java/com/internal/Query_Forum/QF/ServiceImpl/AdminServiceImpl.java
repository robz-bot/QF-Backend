/**
 * 
 */
package com.internal.Query_Forum.QF.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internal.Query_Forum.QF.Common;
import com.internal.Query_Forum.QF.Dto.WidgetsRequest;
import com.internal.Query_Forum.QF.Repository.CommentRepository;
import com.internal.Query_Forum.QF.Repository.PostRepository;
import com.internal.Query_Forum.QF.Repository.ReportRepository;
import com.internal.Query_Forum.QF.Repository.ReportTypeRepository;
import com.internal.Query_Forum.QF.Repository.UserRepository;
import com.internal.Query_Forum.QF.Repository.VoteRepository;
import com.internal.Query_Forum.QF.Service.AdminService;

/**
 * @author Robin
 *
 */
@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	ReportTypeRepository reportTypeRepository;
	
	@Autowired
	ReportRepository reportRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CommentRepository commentRepository;
	
	@Autowired
	VoteRepository voteRepository;

	@Override
	public WidgetsRequest widgetsData() {
		
		WidgetsRequest resultDto=new WidgetsRequest();
		resultDto.setPostCount(postRepository.findAll().size());
		resultDto.setReportTypeCount(reportTypeRepository.findAll().size());
		resultDto.setReportCount(reportRepository.findAll().size());
		resultDto.setActiveUserCount(userRepository.findAllByIsActive(true).size());
		resultDto.setInactiveUserCount(userRepository.findAllByIsActive(false).size());
		resultDto.setCommentCount(commentRepository.findAll().size());
		resultDto.setLikeCount(voteRepository.findAllByVoteType(Common.VOTETYPE_UP).size());
		resultDto.setDislikeCount(voteRepository.findAllByVoteType(Common.VOTETYPE_DOWN).size());
		
		return resultDto;
	}

}

/**
 * 
 */
package com.internal.Query_Forum.QF.Service;

import java.util.List;

import com.internal.Query_Forum.QF.Dto.PostRequest;
import com.internal.Query_Forum.QF.Dto.SearchRequest;

/**
 * @author ROBIN RAJESH
 *
 */
public interface PostService {

	PostRequest newPost(PostRequest postRequest);

	List<PostRequest> getAllPost();

	PostRequest deletePost(Long id);

	PostRequest getPost(Long id);

	List<PostRequest> getUserPostList(Long id);

	List<PostRequest> allPostByUserId(Long id, String type);

	PostRequest updatePost(PostRequest postRequest);

	List<PostRequest> getSearchPostDate(String date);

	

}

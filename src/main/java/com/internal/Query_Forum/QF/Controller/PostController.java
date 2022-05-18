/**
 * 
 */
package com.internal.Query_Forum.QF.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internal.Query_Forum.QF.Dto.PostRequest;
import com.internal.Query_Forum.QF.Dto.SearchRequest;
import com.internal.Query_Forum.QF.Service.PostService;

/**
 * @author ROBIN RAJESH
 *
 */
@RequestMapping("api/post")
@RestController
@CrossOrigin("*")
public class PostController {

	@Autowired
	PostService postService;
	
	@GetMapping("/home")
	public String hello() {
		return "Hello World";
	}

	@PostMapping("/newPost")
	public PostRequest newPost(@RequestBody PostRequest postRequest) {
		PostRequest res = postService.newPost(postRequest);
		return res;
	}
	@PutMapping("/updatePost")
	public PostRequest updatePost(@RequestBody PostRequest postRequest) {
		PostRequest res = postService.updatePost(postRequest);
		return res;
	}

	@GetMapping("/")
	public List<PostRequest> allPost() {
		return postService.getAllPost();
	}
	
	@GetMapping("/allPostByUserId/{id}/{type}")
	public List<PostRequest> allPostByUserId(@PathVariable String id,@PathVariable String type) {
		return postService.allPostByUserId(Long.parseLong(id),type);
	}
	
	@GetMapping("/getPost/{id}")
	public PostRequest getPost(@PathVariable String id) {
		PostRequest res = postService.getPost(Long.parseLong(id));
		return res;
	}
	
	@GetMapping("/getUserPost/{id}")
	public List<PostRequest> getUserPostList(@PathVariable String id){
		List<PostRequest> res = postService.getUserPostList(Long.parseLong(id));
		return res;
	}
	
	@DeleteMapping("/deletePost/{id}")
	public PostRequest deletePost(@PathVariable String id) {
		PostRequest res = postService.deletePost(Long.parseLong(id));
		return res;
	}
	
	@GetMapping("/getSearchPostDate/{date}")
	public List<PostRequest> getSearchPostDate(@PathVariable String date) {
		List<PostRequest> res = postService.getSearchPostDate(date);
		return res;
	}
}

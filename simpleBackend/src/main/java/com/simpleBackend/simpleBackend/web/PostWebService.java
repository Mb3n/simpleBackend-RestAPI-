package com.simpleBackend.simpleBackend.web;


import com.simpleBackend.simpleBackend.data.PostRepository;
import com.simpleBackend.simpleBackend.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class PostWebService {

	@Autowired
	PostRepository postRepository;

	@GetMapping("/")
	public @ResponseBody List<Post> getAllPosts(){
		return (List<Post>) postRepository.findAll();
	}

	@RequestMapping(value = "/addPost",method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<String> addPost(@RequestBody Post post){
		System.out.println(post);
		postRepository.save(post);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}

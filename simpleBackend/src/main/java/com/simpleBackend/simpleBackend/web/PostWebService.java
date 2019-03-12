package com.simpleBackend.simpleBackend.web;


import com.simpleBackend.simpleBackend.data.PostRepository;
import com.simpleBackend.simpleBackend.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostWebService {

	@Autowired
	PostRepository postRepository;

	@GetMapping("/")
	public @ResponseBody List<Post> getAllPosts(){
		return (List<Post>) postRepository.findAll();
	}
}

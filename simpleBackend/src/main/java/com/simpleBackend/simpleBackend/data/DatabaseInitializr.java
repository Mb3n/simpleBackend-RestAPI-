package com.simpleBackend.simpleBackend.data;

import com.simpleBackend.simpleBackend.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

@Component
public class DatabaseInitializr implements ServletContextInitializer {

	@Autowired
	PostRepository postRepository;

	@Override
	public void onStartup(ServletContext servletContext) {
		System.out.println("Populating the database");

		Post post = new Post();
		post.setHeadline("Erster Post!");
		post.setContent("Dies ist mein erster Post");
		postRepository.save(post);

		Post zweiterPost = new Post();
		zweiterPost.setHeadline("Zweiter Post!");
		zweiterPost.setContent("Dies ist mein zweiter Post");
		postRepository.save(zweiterPost);

	}
}

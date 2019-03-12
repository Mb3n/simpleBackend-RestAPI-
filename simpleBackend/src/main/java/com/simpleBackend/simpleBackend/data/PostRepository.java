package com.simpleBackend.simpleBackend.data;

import com.simpleBackend.simpleBackend.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}

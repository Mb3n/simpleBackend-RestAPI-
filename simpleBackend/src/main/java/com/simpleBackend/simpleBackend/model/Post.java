package com.simpleBackend.simpleBackend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Post {

	@Id
	@GeneratedValue
	private Long id;

	private String headline;
	private String content;
}

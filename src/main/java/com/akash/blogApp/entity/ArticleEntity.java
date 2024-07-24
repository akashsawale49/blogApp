package com.akash.blogApp.entity;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.Nullable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="articles")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ArticleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Long id;
	
	@Column(nullable = false)
	@Nonnull
	private String title;
	
	@Column(unique =  true)
	@Nonnull
	private String slug;
	
	@Column(nullable = true)
	@Nullable
	private String subtitle;
	
	@Column(nullable = true)
	private String body;

	
	@CreatedDate
	private Long createdAt;
	
	
	@ManyToOne
	@JoinColumn(name="authorId",nullable = false)
	private UserEntity author;
}

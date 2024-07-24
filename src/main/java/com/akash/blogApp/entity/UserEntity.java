package com.akash.blogApp.entity;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Long id;
	
	@Column(nullable = false)
	@Nonnull
	private String username;
	
	@Column(nullable = false)
	@Nonnull
	private String email;
	
	@Column(nullable = true)
	private String bio;
	
	@Column(nullable = true)
	private String image;
	
	
	
}

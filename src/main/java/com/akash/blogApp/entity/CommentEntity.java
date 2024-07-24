package com.akash.blogApp.entity;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.Nullable;

@Entity(name="comments")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;


    @Nullable
    private String title;

    @Column(nullable = true)
    @Nonnull
    private String body;

    @CreatedDate
    private Long createdAt;


    @ManyToOne
    @JoinColumn(name="articleId",nullable = false)
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name="authorId",nullable = false)
    private UserEntity author;

}

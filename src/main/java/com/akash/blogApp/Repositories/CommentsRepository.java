package com.akash.blogApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.blogApp.entity.CommentEntity;

@Repository
public interface CommentsRepository extends JpaRepository<CommentEntity, Long>{

}

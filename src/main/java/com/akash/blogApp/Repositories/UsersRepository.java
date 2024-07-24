package com.akash.blogApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.blogApp.entity.UserEntity;



@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long>{

}

package com.rush.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rush.journalApp.entity.User;

public interface UserRepository extends MongoRepository<User, Object> {

    User findByUserName(String username);

    void deleteByUserName(String username);

}

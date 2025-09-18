package com.rush.journalApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rush.journalApp.entity.User;
import com.rush.journalApp.repository.UserRepository;
import com.rush.journalApp.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @Autowired
  private UserRepository userRepository;

  @PutMapping("/update-user")
  public ResponseEntity<?> updateUser(@RequestBody User user) {
    String username = SecurityContextHolder.getContext().getAuthentication().getName();
    User existingUser = userService.findByUserName(username);

    existingUser.setUserName(user.getUserName());
    existingUser.setPassword(user.getPassword());

    userService.saveNewUser(existingUser);

    return new ResponseEntity<>("Succefully Updated", HttpStatus.OK);
  }

  @DeleteMapping
  public ResponseEntity<?> deleteUserById() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    userRepository.deleteByUserName(authentication.getName());
    return new ResponseEntity<>("Succefully Deleted", HttpStatus.OK);
  }

}

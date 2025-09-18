// package com.rush.journalApp.service;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.rush.journalApp.repository.UserRepository;

// @SpringBootTest
// public class UserServiceTests {

//     @Autowired
//     private UserRepository userRepository;

//     @Test
//     public void testFindByUserName() {
//         // assertNotNull(userRepository.findByUserName("virat kohli"));
//         assertTrue(!userRepository.findByUserName("virat kohli").getJournalEntries().isEmpty());
//         System.out.println(userRepository.findByUserName("virat kohli").getJournalEntries());
//     }

// }

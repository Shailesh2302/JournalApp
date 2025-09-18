// package com.rush.journalApp.controller;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.rush.journalApp.entity.JournalEntry;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.PutMapping;

// @RestController
// @RequestMapping("/journal")
// public class _JournalEntryController {

// private Map<String, JournalEntry> journalEntries = new HashMap<>();

// @GetMapping
// public List<JournalEntry> getAll() {
// return new ArrayList<>(journalEntries.values());
// }

// @PostMapping
// public boolean createEntry(@RequestBody JournalEntry myEntry) {
// journalEntries.put(myEntry.getId(), myEntry);
// return true;
// }

// @GetMapping("id/{myId}")
// public JournalEntry getJournalEntryById(@PathVariable String myId) {
// return journalEntries.get(myId);
// }

// @DeleteMapping("id/{myId}")
// public JournalEntry deleteJournalEntryById(@PathVariable String myId) {
// return journalEntries.remove(myId);
// }

// @PutMapping("id/{myId}")
// public JournalEntry updateJournalEntryById(@PathVariable String myId,
// @RequestBody JournalEntry myEntry) {
// return journalEntries.put(myId, myEntry);

// }

// }

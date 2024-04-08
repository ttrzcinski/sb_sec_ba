package org.ttrzcinski.sb_sec_ba.repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/issues")
    public List<String> getIssues() {
        return Collections.singletonList("You're using Spring Boot.");
    }
}
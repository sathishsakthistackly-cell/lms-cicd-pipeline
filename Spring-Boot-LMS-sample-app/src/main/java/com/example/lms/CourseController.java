package com.example.lms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    @GetMapping("/api/courses")
    public List<Map<String, Object>> courses() {
        return List.of(
            Map.of("id", 1, "name", "AWS DevOps Fundamentals", "duration", "4 weeks"),
            Map.of("id", 2, "name", "Linux Administration", "duration", "3 weeks"),
            Map.of("id", 3, "name", "Docker and Kubernetes", "duration", "4 weeks")
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "application", "LMS");
    }
}

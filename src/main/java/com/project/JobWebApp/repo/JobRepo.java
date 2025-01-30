package com.project.JobWebApp.repo;

import com.project.JobWebApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must Have Good Experience", 2, List.of("Java")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("JavaScript")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 3, List.of("Swift"))
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }
}

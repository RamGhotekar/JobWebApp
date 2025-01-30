package com.project.JobWebApp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Component
public class JobPost {
    private int postID;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    public JobPost(int postID, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postID = postID;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }
}

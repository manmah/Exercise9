package com.maher;

import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class SatisfactionService2 {

    private final EmailService emailService;
    private final GitHub gitHub;
    private final String orgName;
    private final int githubListSize;
    List<GHUser> members;

    public SatisfactionService2(EmailService emailService, GitHub gitHub,
                                @Value("${GITHUB_ORG}") String orgName,@Value("${githubListSize}") int githubListSize) {
        this.emailService = emailService;
        this.gitHub = gitHub;
        this.orgName = orgName;
        this.githubListSize = githubListSize;
    }


    public void satisfy() throws IOException {
        members =  gitHub.getOrganization(orgName).getMembers().subList(0, githubListSize);
        for (GHUser member : members){
            System.out.println(emailService.sendEmail(member.getLogin()));
        }
    }
}

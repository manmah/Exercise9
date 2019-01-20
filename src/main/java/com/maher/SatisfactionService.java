package com.maher;

import org.kohsuke.github.GHOrganization;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;

@Component
public class SatisfactionService {

    private final EmailService emailService;
    private final GitHub gitHub;
    private final Environment environment;
     List<GHUser> members;

    public SatisfactionService(EmailService emailService, GitHub gitHub, Environment environment) {
        this.emailService = emailService;
        this.gitHub = gitHub;
        this.environment = environment;
    }


    public void satisfy() throws IOException {
        GHOrganization ghOrganization =  gitHub.getOrganization(environment.getProperty("GITHUB_ORG"));
        members = ghOrganization.getMembers();
        for (GHUser member : members){
            System.out.println(emailService.sendEmail(member.getLogin()));
        }
    }
}

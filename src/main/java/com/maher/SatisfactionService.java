package com.maher;

import org.kohsuke.github.GHOrganization;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;

@Component
public class SatisfactionService {

    EmailService emailService;
    GitHub gitHub;
     List<GHUser> members;

    public SatisfactionService(EmailService emailService, GitHub gitHub) {
        this.emailService = emailService;
        this.gitHub = gitHub;
    }


    public void fetchUsers() throws IOException {
        GHOrganization ghOrganization =  gitHub.getOrganization("ReDI-School");
        members = ghOrganization.getMembers();
   /*     for (GHUser member : members){
            System.out.println(member.getName());
        }*/
    }

    public void satisfy() throws IOException {
        fetchUsers();
        for (GHUser member : members){
            System.out.println(emailService.sendEmail(member.getName()));
        }
    }
}

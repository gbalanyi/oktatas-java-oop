package io.github.gbalanyi.java.oop.solid.dependency.bad;

public class EmailService {

    public EmailService(String smtpServer, String user, String password, String otherConfig){
        //
    }

    public void sendActivation(String address, String name){
        // Send activation
    }
}

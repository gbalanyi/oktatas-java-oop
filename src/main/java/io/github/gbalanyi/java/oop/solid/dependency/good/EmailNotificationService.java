package io.github.gbalanyi.java.oop.solid.dependency.good;

public class EmailNotificationService implements NotificationService{

    public EmailNotificationService(String smtpServer, String user, String password, String otherConfig){
        //
    }

    @Override
    public void sendActivation(String address, String message) {
        // Send activation
    }
}

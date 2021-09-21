package io.github.gbalanyi.java.oop.solid.dependency.good;

public class NotificationServiceFactory {

    public NotificationService createNotificationService() {
        return new EmailNotificationService(this.getSmtpServer(),
                this.getUser(),
                this.getPassword(),
                this.getOtherConfig());
    }

    private String getSmtpServer() {
        return "smtpServer";
    }

    private String getUser() {
        return "user";
    }

    private String getPassword() {
        return "password";
    }

    private String getOtherConfig() {
        return "otherConfig";
    }
}

package io.github.gbalanyi.java.oop.solid.single.good;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmailService {

    public void sendEmail(String address, String message) {

        Map<String, String> emails = new LinkedHashMap<>();

        emails.putAll(this.shouldSendNotAllowedHostWarning(address));
        emails.putAll(this.shouldSendInspectionWarning(address));
        emails.put(address, message);

        this.sendEmailsInternal(emails);
    }

    private void sendEmailsInternal(Map<String, String> emails) {
        for (Map.Entry<String, String> email : emails.entrySet()) {
            this.sendEmailInternal(email.getKey(), email.getValue());
        }
    }

    private void sendEmailInternal(String address, String message) {
        // Send email
    }

    private String[] getAllowedHosts() {
        return new String[]{"company.com", "partner.com"};
    }

    private String[] getInspectedExpressions() {
        return new String[]{"secret information", "business strategy"};
    }

    private Map<String, String> shouldSendNotAllowedHostWarning(String address) {
        Map<String, String> notAllowedHostWarningEmail = new HashMap<>();
        String[] allowedHosts = getAllowedHosts();
        boolean hostAllowed = false;
        for (String allowedHost : allowedHosts) {
            if (address.toLowerCase().endsWith(allowedHost)) {
                hostAllowed = true;
                break;
            }
        }
        if (!hostAllowed) {
            notAllowedHostWarningEmail.put("notallowedhost@mycompany.com",
                    String.format("Warning send email to a not allowed host! %s", address));
        }

        return notAllowedHostWarningEmail;
    }

    private Map<String, String> shouldSendInspectionWarning(String message) {
        Map<String, String> inspectionWarningEmail = new HashMap<>();
        String[] inspectedExpressions = getInspectedExpressions();
        boolean inspectionWarning = false;
        for (String inspectedExpression : inspectedExpressions) {
            if (message.toLowerCase().contains(inspectedExpression)) {
                inspectionWarning = true;
                break;
            }
        }
        if (inspectionWarning) {
            inspectionWarningEmail.put("inspectionwarning@mycompany.com",
                    String.format("Warning the given message contains sensitive information! %s", message));
        }

        return inspectionWarningEmail;
    }
}

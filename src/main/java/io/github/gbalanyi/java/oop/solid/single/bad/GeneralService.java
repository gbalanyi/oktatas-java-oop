package io.github.gbalanyi.java.oop.solid.single.bad;

import io.github.gbalanyi.java.oop.basics.Person;

public class GeneralService {

    public void printDocument(String document) {
        // Print document
    }

    public void savePerson(Person person) {
        // Save person
    }

    public void sendEmail(String address, String message) {

        String[] allowedHosts = new String[]{"company.com", "partner.com"};
        boolean hostAllowed = false;
        for (String allowedHost : allowedHosts) {
            if (address.toLowerCase().endsWith(allowedHost)) {
                hostAllowed = true;
                break;
            }
        }
        if (!hostAllowed) {
            sendEmailInternal("notallowedhost@mycompany.com",
                    String.format("Warning send email to a not allowed host! %s", address));
        }

        String[] inspectedExpressions = new String[]{"secret information", "business strategy"};
        boolean inspectionWarning = false;
        for (String inspectedExpression : inspectedExpressions) {
            if (message.toLowerCase().contains(inspectedExpression)) {
                inspectionWarning = true;
                break;
            }
        }
        if (inspectionWarning) {
            sendEmailInternal("inspectionwarning@mycompany.com",
                    String.format("Warning the given message contains sensitive information! %s", message));
        }

        this.sendEmailInternal(address, message);
    }

    private void sendEmailInternal(String address, String message) {
        // Send email
    }
}

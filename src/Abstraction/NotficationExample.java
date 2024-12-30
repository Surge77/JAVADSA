package Abstraction;

public class NotficationExample {

    public static void main(String[] args) {

        NotificationService EmailService = new EmailService("user@gmail.com");
        NotificationService SMSNotificationService = new SMSNotificationService("user@gmail.com");

        EmailService.sendNotifications("Hello this is email");
        SMSNotificationService.sendNotifications("Hello this is sms");

        EmailService.subscribeToTopic("Arts");
        SMSNotificationService.subscribeToTopic("Fiction");
    }
}

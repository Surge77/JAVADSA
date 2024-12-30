package Abstraction;

public class SMSNotificationService implements NotificationService{

    private String phoneNumber;

    public SMSNotificationService(String phoneNumber){
        this.phoneNumber = phoneNumber;

    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("SMS notification send to "+ phoneNumber);

    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribed" + phoneNumber + "to notfication for topic " + topic);

    }
}

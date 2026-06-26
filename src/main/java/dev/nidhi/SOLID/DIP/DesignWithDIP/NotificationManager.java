package dev.nidhi.SOLID.DIP.DesignWithDIP;


// Decides who gets the notification and which channel to use
class NotificationManager {

    private EmailService email;
    private SMSService sms;
    private WhatsAppService whatsapp;

    public NotificationManager(EmailService email, SMSService sms,
                               WhatsAppService whatsapp) {
        this.email = email;
        this.sms = sms;
        this.whatsapp = whatsapp;
    }

    public void notify(User user) {

        email.send(user);
        sms.send(user);

        if(user.getType().equals("premium")) {
            whatsapp.send(user);
        }
    }
}

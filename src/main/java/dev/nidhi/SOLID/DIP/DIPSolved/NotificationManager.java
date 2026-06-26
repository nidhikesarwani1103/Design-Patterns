package dev.nidhi.SOLID.DIP.DIPSolved;

    class NotificationManager {

        private NotificationSender emailSender;
        private NotificationSender smsSender;
        private NotificationSender whatsappSender;

        public NotificationManager(NotificationSender email, NotificationSender sms,
                                   NotificationSender whatsapp) {
            this.emailSender = email;
            this.smsSender = sms;
            this.whatsappSender = whatsapp;
        }

        public void notify(User user) {

            emailSender.send(user);
            smsSender.send(user);

            if (user.getType().equals("premium")) {
                whatsappSender.send(user);
            }
        }

}

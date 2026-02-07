package io.matoshri.demo2;

public class WhatsappSmsSender implements SmsSender {
    @Override
    public void send(String to) {
        System.out.println("Whatsapp ");
        System.out.println("Sending sms to " + to );
    }
}

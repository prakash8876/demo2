package io.matoshri.demo2;

public class TwillioSmsSender implements SmsSender {
    @Override
    public void send(String to) {
        System.out.println("Twillio ");
        System.out.println("Sending sms to " + to);
    }
}

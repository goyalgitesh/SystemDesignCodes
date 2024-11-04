package lld.observerPattern.observer;

import lld.observerPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock, hurry up!");

    }
    private void sendMail(String emailId, String message) {
        System.out.println(message + "\nMail sent to: " + emailId);
    }
}

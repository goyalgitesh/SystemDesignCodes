package lld.observerPattern.observer;

import lld.observerPattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable) {
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in stock, hurry up!");

    }
    private void sendMsgOnMobile(String username, String message) {
        System.out.println(message + "\nMessage sent to: " + username);
    }

}

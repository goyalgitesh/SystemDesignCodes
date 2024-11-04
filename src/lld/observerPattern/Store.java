package lld.observerPattern;

import lld.observerPattern.observable.IphoneObservableImpl;
import lld.observerPattern.observable.StocksObservable;
import lld.observerPattern.observer.EmailAlertObserverImpl;
import lld.observerPattern.observer.MobileAlertObserverImpl;
import lld.observerPattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("John",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);


    }
}

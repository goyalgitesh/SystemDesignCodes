package lld.observerPattern.observable;

import lld.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {observerList.add(observer); }

    @Override
    public void remove(NotificationAlertObserver observer) {observerList.remove(observer); }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded) {
        if(stockCount == 0) { // that means new stock is coming so notifying the subscribers
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    public int getStockCount() {return stockCount; }

}

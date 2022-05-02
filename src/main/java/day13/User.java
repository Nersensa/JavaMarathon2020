package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String USERNAME;    //имя пользователя
    private final List<User> subscriptions;   //подписки на других пользователей

    public User(final String USERNAME) {
        this.USERNAME = USERNAME;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        if (!subscriptions.contains(user)) {
            subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return subscriptions.contains(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MassageDatabase.sendMessage(this, user, text);
    }

    public String toString() {
        return USERNAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}

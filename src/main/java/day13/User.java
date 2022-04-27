package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;    //имя пользователя
    private List<User> subscriptions;   //подписки на других пользователей

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        if (!subscriptions.contains(user)) {
            subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)) {
            return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        if (subscriptions.contains(user) && user.isSubscribed(this)) {
            return true;
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        MassageDatabase.sendMessage(this, user, text);
    }

    public String toString() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}

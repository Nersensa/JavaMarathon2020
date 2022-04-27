package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Dima");
        User user2 = new User("Denis");
        User user3 = new User("Sveta");

        user1.sendMessage(user2, "privet");
        user1.sendMessage(user2, "kak dela?");

        user2.sendMessage(user1, "privet");
        user2.sendMessage(user1, "norm");
        user2.sendMessage(user1, "sam kak?");

        user3.sendMessage(user1, "privet");
        user3.sendMessage(user1, "4e tam?");
        user3.sendMessage(user1, "sam kak?");

        MassageDatabase.showDialog(user1,user3);
        MassageDatabase.getMessages();


    }
}

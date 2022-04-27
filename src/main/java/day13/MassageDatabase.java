package day13;

import java.util.ArrayList;
import java.util.List;

public class MassageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message element: messages) {
            if ((element.getSender() == u1 && element.getReceiver() == u2) || (element.getSender() == u2 && element.getReceiver() == u1)) {
                System.out.println(element.getSender() + ": " + element.getText());
            }
        }
    }
}

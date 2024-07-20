package com.example.ChatStream.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/echo")
    @SendTo("/topic/messages")
    public String echoMessage(String message) throws InterruptedException{
        // Echo with delay
        String echoMessage = "{ \"type\": \"echo\", \"message\": \"" + message + "\" }";
        Thread.sleep(100); // Simulate delay
        return echoMessage;
    }

    @MessageMapping("/reverse")
    @SendTo("/topic/messages")
    public String reverseMessage(String message) throws InterruptedException {
        // Reverse message
        String reversedMessage = new StringBuilder(message).reverse().toString();
        String reverseMessage = "{ \"type\": \"reverse\", \"message\": \"" + reversedMessage + "\" }";
        Thread.sleep(200); // Simulate delay
        return reverseMessage;
    }

    @MessageMapping("/count")
    @SendTo("/topic/messages")
    public String countLastCharacter(String message) throws InterruptedException {
        // Count occurrences of last character
        if (message.length() > 0) {
            char lastChar = Character.toLowerCase(message.charAt(message.length() - 1));
            int count = countOccurrences(message.substring(0, message.length() - 1), lastChar);
            String countMessage = "{ \"type\": \"count\", \"count\": " + count + " }";
            Thread.sleep(300); // Simulate delay
            return countMessage;
        }
        return "{ \"type\": \"count\", \"count\": 0 }"; // No characters to count
    }

    private int countOccurrences(String text, char ch) {
        int count = 0;
        for (char c : text.toCharArray()) {
            char i= Character.toLowerCase(c);
            if (i == ch)
                count++;
        }
        return count;
    }
}

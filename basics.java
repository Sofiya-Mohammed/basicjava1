package org.example;

public class basics {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {"Hello Twinkle !", "Hello Java !", "Hello World !"};

        while (i < 4) { // Use greetings.length instead of hardcoding 4
            try {
                System.out.println(greetings[i++]); // Increment i after printing
            } catch (Exception e) {
                System.out.println("exception"); // Message of exception e in String form
            } finally {
                System.out.println("You should quit and reset index value < 3 :");
            }
        }
    }
}

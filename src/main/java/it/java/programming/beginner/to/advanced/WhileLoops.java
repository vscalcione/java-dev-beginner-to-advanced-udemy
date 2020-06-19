package it.java.programming.beginner.to.advanced;

public class WhileLoops {

    public static void main(String[] args) {
        int value = 23;
        boolean myLoop = value < 28;
        while(value < 34){
            System.out.println("OK => " + value);
            value += 2;
        }
    }
}

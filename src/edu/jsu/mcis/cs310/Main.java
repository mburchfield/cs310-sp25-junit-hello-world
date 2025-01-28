package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {

        StringBuilder res = new StringBuilder();

        // Appending elements of s in res
        res.append(message);

        // reverse StringBuilder res
        res.reverse();

        // print reversed String
        System.out.println(res);

        return res.toString();
    }
    
}
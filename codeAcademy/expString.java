package codeAcademy;

public class expString {
    public static void main(String[] args) {
        String message = "Hello World" + "!!";

        System.out.println(message);
        
        System.out.println(message.toLowerCase()); //change the string to lower case
        
        System.out.println(message.toUpperCase()); //change the string to upper case

        System.out.println(message.replace("!!", "??")); //replace string with another

        System.out.println(message.indexOf("o")); //find the index of a string

        System.out.println(message.indexOf("ello")); //return only index of "e"

        System.out.println(message.indexOf("meow")); //return -1 for a string that does not exist

        System.out.println(message.length()); //length of the string

        System.out.println(message.startsWith("!!"));//return false for wrong initial string

        System.out.println(message.endsWith("!!"));//return true for right ending string
    }
}

import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        String text = "hello world";
        String UpperText = text.toUpperCase();
        System.out.println(UpperText);
int CharacterCount = text.length();
        System.out.println("Number of characters: " + CharacterCount);
        char firstchar = text.charAt(0);

        System.out.println("First character: " + firstchar);
        int x=10 , y= 20;
                System.out.println( "Addition: " +  (x+y) );
                System.out.println( "Subtract: " + (x-y) );
        System.out.println( "Multpile: " + (x*y) );
        System.out.print( "Division: " + (x/y) );
}}
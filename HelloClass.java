/**
 * Created by willc on 2/6/17.
 */
import java.util.Scanner;

public class HelloClass {
    private String name;

    public String getName(){
        return name;
    }
    public void prntName(){
        System.out.println("Hello, your name must be " + name);
    }
    public void setName(){
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter your name: ");
       name = input.nextLine();
    }
}

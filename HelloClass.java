/**
 * Created by willc on 2/6/17.
 *
 * no constructor was used because name is only set when
 * the setName is ran.
 */
import java.util.Scanner;

public class HelloClass {
    private String name="default_name";

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

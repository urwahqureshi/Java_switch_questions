
import java.util.Scanner;
public class Fruitcolor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fruit name:");
        String fruits = sc.nextLine();
        switch (fruits.toLowerCase()){
            case "apple":
            System.out.println("red");
            break;
            case "banana":
            System.out.println("yellow");
            break;
            case "ggrape":
            System.out.println("purple");
            break;
            case "orange":
            System.out.println("orange");
            break;
            default:
            System.out.println("unknown colors");
            break;

        }
    }
    
}

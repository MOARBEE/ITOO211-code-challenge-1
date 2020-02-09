import java.util.Scanner;
public class Initials {

    Scanner scanner = new Scanner(System.in);
    String name;


    public String getName(){
        System.out.println("Enter a name: ");
        name = scanner.next();
        return name;
    }

    public char getindex(){
        getName();
        return name.charAt(0);
    }


    public void workout() {
        char index = getindex();
        if (index == 'M' || index == 'm') {

           System.out.println("*       *");
           System.out.println("* *    **");
           System.out.println("*  *  * *");
           System.out.println("*   *   *");
           System.out.println("*       *");
           System.out.println("*       *");
        }

       else {
           System.exit(0);
       }
    }

    public static void main(String[] args) {
       Initials obj = new Initials();
       obj.workout();
    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> persons = new ArrayList<Person>();
            System.out.print("How many person you want to add:");
            int numObj = scan.nextInt();
            for(int i = 0;i<numObj; i++){
                System.out.println("Please Enter the name ");
                scan.next();
                String name = scan.nextLine();
                System.out.println("Please Enter the age ");
                int age = scan.nextInt();
                Person person = new Person(name, age);
                persons.add(person);
            }
            scan.close();
            System.out.println("Print the Array: ");
            for(int j = 0;j<numObj; j++){
                System.out.println(persons.get(j).getName());
            }
    }
}

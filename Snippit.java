import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;

public class Snippit
{
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
            cars.add("Ferrari");
            cars.add("Bugatti");
            cars.add("Lamborghini");
            cars.add("Lamborghini Delete Me");
            cars.remove(3);
            System.out.println("This is the List: "+cars);
        HashSet <String> cars1 = new HashSet<String>();
            cars1.add("Toyota");
            cars1.add("Ford");
            cars1.add("BMW");
            cars1.add("BMW Delete Me");
            cars1.remove("BMW Delete Me");
            System.out.println("This is the Set:"+cars1);
     
        HashMap<String, String> cars2 = new HashMap<String, String>();
            cars2.put("Piero Ferrari and Exor N.V. ", " Ferrari");
            cars2.put("McLaren Automotive ", " McLaren");
            cars2.put("McLaren Automotive Delete", " McLaren");
            cars2.remove("McLaren Automotive Delete");
            System.out.println("This is the Map: "+cars2);
    }
}

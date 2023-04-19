package CollectionFrameWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Map<String,Integer> people = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        int totalage = 0;
        int i = 1;
        System.out.println("Please enter the name and age of people");
        int age = 0;
        while(i <= 5){
            System.out.print("Enter name here of person: " + i + " : ");
            String name = sc.next();
            System.out.print("Enter the age of person: " + i + " : ");
            age = sc.nextInt();
            people.put(name,age);
            i++;
        }
        int i2 = 1;
        System.out.println("================== Peoples names and ages =================");
        for(Map.Entry<String,Integer> entry : people.entrySet()){
            System.out.println(i2++ + " Name is: " + entry.getKey() + " :age is: " + entry.getValue());
        }


    }
}

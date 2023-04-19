package CollectionFrameWorks;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListClass2 {
    public static void main(String[] args) {

        ArrayList <String> month = new ArrayList <>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        System.out.println(month);

        //month.clear();
        //month.set(10, "Current Month");
        //month.remove(10);

        for(int i = 0; i < month.size(); i++) {
            System.out.println(month.get(i));
        }
        System.out.println("=====================");
        for (String i : month) {
            System.out.println(i);
        }

        // ask user to enter 5 numbers
        // and add all numbers to an Array list
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        try{
            for (int i = 1; i <= 5; i++) {

                System.out.print("Enter a number: " + i + " : ");
                numbers.add(input.nextInt());

            }
            int max = 0;
            for(int i : numbers){
                if(i > max){
                    max = i;
                }
            }
            System.out.println("Max number is " + max);
            //Collections.sort(numbers);
            //System.out.println(numbers.get(4));
            //System.out.println(numbers.get(numbers.size() - 1));





        }catch (Exception e){
            System.out.println("Something went wrong! Try again later");
            System.out.println(e.getMessage());
        }

        //[1,3,55,66,11]

        ArrayList <String> newMonth = new ArrayList<String>();

        newMonth.addAll(month);

        for(String i: month){
            newMonth.add(i);
        }
        ArrayList sec_list = (ArrayList)month.clone();
        System.out.println(sec_list);
        System.out.println(newMonth);

        System.out.println(newMonth.contains("October"));

        month.clear();
        month.ensureCapacity(12);
        System.out.println(month);

        //isEmpty() Checks if the arrayList is empty
        month.add("Oct");
        System.out.println(month.isEmpty());

        System.out.println(sec_list.indexOf("Jul"));
        System.out.println(sec_list.indexOf("QA"));
        System.out.println(newMonth.equals(sec_list));


    }
}

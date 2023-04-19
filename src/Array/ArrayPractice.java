package Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // find out the size of an array

        int [] nums = {2,4,6,8,10,12};
        System.out.println(nums.length);

        // search
        System.out.println(Arrays.binarySearch(nums, 10));

        String [] fruits = {"Apple", "Peach", "Banana", "Kiwi"};

        System.out.println(Arrays.binarySearch(fruits, "Apple"));

        // sort

        char [] c = {'a', 'x', 'o', 'A', 'B', 'y'};
        System.out.println("Before Sort");
        for(char ch: c) {
            System.out.print(ch + ", ");
        }
        System.out.println();
        System.out.println("After Sort");
       Arrays.sort(c);
        for(char ch: c) {
            System.out.print(ch + ", ");
        }

        System.out.println();
        Arrays.sort(fruits);
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        String[] Months = new String[12];

        Months[0] = "Jan";
        Months[1] = "Feb";
        Months[2] = "Mar";
        Months[3] = "Apr";
        Months[4] = "May";
        Months[5] = "Jun";
        Months[6] = "Jul";
        Months[7] = "Aug";
        Months[8] = "Sep";
        Months[9] = "Oct";
        Months[10] = "Nov";
        Months[11] = "Dec";


        System.out.println("===========================================================");
        // toString
        System.out.println(Arrays.toString(Months));




        // copyOfRange
        System.out.println(Arrays.toString(Arrays.copyOfRange(Months, 2, 5)));
        System.out.println(Arrays.toString(Months).substring(0,5));


        int [] a = {1,2,3,4};
        int [] b = {1,2,3,4};

        //equals

        System.out.println(Arrays.equals(a, b));

        int max = 0;
        for(int x : a){
            if(x > max){
                max = x;
            }
        }
        System.out.println(max);
    }
}

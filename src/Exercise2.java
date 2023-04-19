public class Exercise2 {
    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4, 5, 6};
        int oddCount = 0;
        int evenCount = 0;
        int [] oddCount1 = {};
        int [] evenCount1 = {};


        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                evenCount++;
                System.out.println(" Even Number: " + numbers[i]);


            }else if(numbers[i] % 2 == 1) {
                oddCount++;
                System.out.println(" Odd Number: " + numbers[i]);
            }
        }
        System.out.println(" Odd Count: " + oddCount  + " Even Count: " + evenCount);


    }
}

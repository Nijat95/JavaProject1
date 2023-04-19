public class ReviewExercise {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        int rows = 5;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*String name1 [] = {"Bob", "Kyle", "John", "Michael", "Ken"};

        String name [] = new String[10];
        name[0] = "Bob";
        name[1] = "Allen";
        name[2] = "John";
        name[3] = "Michael";
        name[4] = "Ken";
        name[5] = "Tom";
        name[6] = "Tim";
        name[7] = "Helen";
        name[8] = "Jennifer";
        name[9] = "Michelle";


        for (int i = 0; i < name1.length; i++) {
            System.out.println(name1[i]);

        }

        for(String namo : name){
            System.out.println(namo);
        }
*/
        byte [] nums = {3,5,2,20,9,99};

        byte min = nums[0];
        byte max = nums[0];

        for(byte num : nums){
            if (max < num){
                max = num;
            }
            if(min > num){
                min = num;

        }
        }
        System.out.println(max - min + " Is the difference between largest and smallest element values");

        int evenNums = 0;
        int oddNums = 0;

        for(byte n : nums){
            if(n % 2 == 0){
                evenNums++;
            }
            if(n % 2 == 1){
                oddNums++;
            }
        }
        System.out.println("Even Nums: " + evenNums + " odd Nums: " + oddNums);

        int [][][] threeDarray = {
                {
                        {1,4,5},
                        {4,3,7},
                },
                {
                        {3,7,9},
                        {2,5,3}
                },
                {
                        {4,5,1},
                        {3,7,4},
                }
        };
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0; i < 3; i++) {
           for(int y = 0; y < 2; y++) {
               for( int z = 0; z < 3; z++) {
                   if(threeDarray[i][y][z] % 2 == 0){
                       evenCount++;
                   }
                   if(threeDarray[i][y][z] % 2 == 1){
                       oddCount++;
                   }
               }
           }

        }

        System.out.println("Even numbers " + evenCount + "\nOdd Count " + oddCount);



    }
}

package Array;

public class Arrays2 {
    public static void main(String[] args) {

        // create int [] nums 5
        // print out the largest number
       /* int[] nums = {2, 6, 243, 6, 4};

                for (int i = 0; i < nums.length; i++) {
                    for(int j = 0; j < nums.length; j++) {
                        if(nums[i] == nums[j] && i != j) { // nums[0] = 2 nums[0] = 2
                            System.out.println(nums[i] + " is duplicated at index " + i + " and " + j);
                            break;
                        }
                    }
                }

                // find a duplicate num
        // print the duplicate value
        */

        // 2 colums and 2 rows
        int [][] twoD_Arrays = new int [2][2];
        twoD_Arrays[0][0] = 2;
        twoD_Arrays[0][1] = 4;
        twoD_Arrays[1][0] = 3;
        twoD_Arrays[1][1] = 6;

        // 2 colums and 2 rows
        int [][] nums2 = {{5,10}, {4,8}};

        String [][] data = new String[3][3];
        data[0][0] = "John";
        data[0][1] = "Smith";
        data[0][2] = "Teacher";

        data[1][0] = "Bob";
        data[1][1] = "Kennedy";
        data[1][2] = "Astronaut";

        data[2][0] = "Ali";
        data[2][1] = "Ivanov";
        data[2][2] = "SDET";

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data.length; j++){
                System.out.println(data[i][j]);
                System.out.println("---------------------");
            }
        }
            //create 2D array (int) colum 3 and row 5

        int [][] twoD_Arrays1 = new int [3][5];
        twoD_Arrays1[0][0] = 2;
        twoD_Arrays1[0][1] = 4;
        twoD_Arrays1[0][2] = 3;
        twoD_Arrays1[0][3] = 6;
        twoD_Arrays1[0][4] = 6;

        twoD_Arrays1[1][0] = 8;
        twoD_Arrays1[1][1] = 10;
        twoD_Arrays1[1][2] = 12;
        twoD_Arrays1[1][3] = 14;
        twoD_Arrays1[1][4] = 16;

        twoD_Arrays1[2][0] = 18;
        twoD_Arrays1[2][1] = 24;
        twoD_Arrays1[2][2] = 33;
        twoD_Arrays1[2][3] = 46;
        twoD_Arrays1[2][4] = 56;
        System.out.println(twoD_Arrays1.length);
        System.out.println(twoD_Arrays1[0].length);
        System.out.println(twoD_Arrays1[1].length);
        System.out.println(twoD_Arrays1[2].length);

        int [][] twoD_Arrays11 = {{2,0,55,88}, {2,0,55,88}, {2,0,55,99}};

        //char [][] ch = new char[4] [3]
        //find if the first element of the arrays are the same/equal

        char [][] ch = {{'f','h','t'},{'r','e','i'},{'f','r','n'},{'r','m','w'}};

        char x1 = ch[0][0], x2 = ch[1][0], x3 = ch[2][0], x4 = ch[3][0];

        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < ch.length; j++){
                if(ch[i][0] == ch[j][0] && j != i){
                    System.out.println(ch[i][0] + " is repeated at index ch[" + i + "][0] and [" + j + "][0]");
                    break;
                }
            }

        }





    }
}

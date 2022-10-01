public class DataTypes {

    public static void main(String[] args) {
        // primitive data types

        //whole numbers - numbers without decimals
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;

        //decimal number
        float f = 1.5f;
        double d = 2.5d;

        //character
        char c = '@', c2 = '3', c3 = 'g';

        //boolean
        boolean boolean1 = true, boolean2 = false;

        //at least 2 variables for each data type
        // for numbers; sum, deduct

        byte b1 = 20;
        byte sumOfByte = (byte) (b1 + b);
        System.out.println("The Sum of " + b1 + " and " + b + " is equal to " + sumOfByte);

        short s1 = 10;
        short s2 = 15;
        short sumOfShort = (short) (s1 + s2);
        System.out.println("The Sum of " + s1 + " and " + s2 + " is equal to " + sumOfShort);

        int i1 = 20;
        int i2 = 30;
        int sumOfInt = (int) (i1 + i2);
        System.out.println("The Sum of " + i1 + " and " + i2 + " is equals to" + sumOfInt);

        long l1 = 40;
        long l2 = 50;
        long sumOfLong = (long) (l1 + l2);
        System.out.println("The Sum of " + l1 + " and " + l2 + " is equal to" + sumOfLong);

        float f1 = 1.5f;
        float f2 = 2.5f;
        float sumOfFloat = (float) (f1 + f2);
        System.out.println("The Sum of " + f1 + " and " + f2 + " is equal to " + sumOfFloat);

        double d1 = 1.5;
        double d2 = 2.5;
        double sumOfDouble = (double) (d1 + d2);
        System.out.println("The Sum of " + d1 + " and " + d2 + " is equal to " + sumOfDouble);

        //byte
        byte byte1 = 5, byte2 = 10, byte3 = (byte)(byte1 + byte2);

        //short
        short short1 = 1000;
        short short2 = 500;
        short Short3 = (short) (short1 + short2);
        System.out.println("The difference is " + Short3);


        //int
        int int1 = 1000;
        int int2 = 5000;
        int Int3 = int1 + int2;
        System.out.println(Int3);
        //Long
        long long1 = 50, long2 = 100, long3 = long1 - long2;
        System.out.println(long3);
        //Float
        float float1 = 10.5f,float2 = 5.95f;
        float Float3 = float1 + float2;
        System.out.println(Float3);
        //Double
        double double1 = 3.5,double2 = 6.8d;
        double Double3 = double1 - double2;
        System.out.println(Double3);

        //eggs, milk, bread, apple, honey
        float eggs = 3.99f;
        double eggsD = eggs;


        byte milk = 6;
        double bread = 4.50, eggOrganic = 5.99;
        long apple = 10;

        float sum3 = (float)(apple + milk + eggsD + bread);

        int honey = 100;
        short honeyS = (short) honey;

        int sum = honey + milk;
        int sum2 = (int)(honey + apple);

        short ss = 150;
        byte bb = (byte) ss;
        System.out.println(bb);

        //daily shopping list of items
        //create var with diff data types
        // fin sum of all products


        float chocolate = 4.99f;
        int tomato = 12;
        double pickles = 2.99d;
        byte cookies = 7;
        long caviar = 400;

        double total = (chocolate + tomato + pickles + cookies + caviar);
        System.out.println(total);










    }
}

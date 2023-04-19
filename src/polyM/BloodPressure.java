package polyM;

public class BloodPressure {

    public String bloodPressure(){
        return "120 over 80 is the normal BP";
    }
}

class HighBP extends BloodPressure {
    public String bloodPressure(){
        return "above 130 over 80 is high BP";
    }
}

class LowBP extends BloodPressure {
    public String bloodPressure(){
        return "100 over 60 is low BP";
    }
}

class Demo2{
    public static void main(String[] args) {
        BloodPressure bp;
        bp = new BloodPressure();
        System.out.println(bp.bloodPressure());

        bp = new HighBP();
        System.out.println(bp.bloodPressure());

        bp = new LowBP();
        System.out.println(bp.bloodPressure());

    }
}
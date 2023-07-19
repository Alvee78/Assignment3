package class19.E7;

public class ReplaceTester {
    public static void main(String[] args) {
        String stateName = "mississipi";
        System.out.println("Actual = "+ stateName);
        stateName = stateName.replace("i","!");
        stateName = stateName.replace("s","$");
        System.out.println("Expected = "+ stateName);
    }
}

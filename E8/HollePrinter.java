package class19.E8;

public class HollePrinter {
    private String helloWorld;
    public HollePrinter(){
        helloWorld = "hello ,world";
    }
    public String replaceEAndO(){
        helloWorld = helloWorld.replace("e","i");
        helloWorld = helloWorld.replace("o","e");
        helloWorld = helloWorld.replace("i","o");
        return helloWorld;
    }
}

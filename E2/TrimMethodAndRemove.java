package class19.E2;

public class TrimMethodAndRemove {
    private String name;
    public TrimMethodAndRemove(){
        name = "       Md   Mehedy Abu Hasan         Alvee   ";
    }
    public String trimStrig(){
        return name.trim();
    }
    public String eraseSpace(){
        return name.replace(" ", "");
    }

}

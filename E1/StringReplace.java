package class19.E1;

public class StringReplace {
    private String stateName ;
    public StringReplace(){
        stateName = "Mississippi" ;
    }
    public String replaceI(){
        String newStateName;
        newStateName = stateName.replace("i","ii");
        return newStateName;
    }
    public String replaceSS(){
        String newSateName;
        newSateName = stateName.replace("ss","s");
        return newSateName;
    }
    public int calculateLength(String name){
        return name.length();
    }
}

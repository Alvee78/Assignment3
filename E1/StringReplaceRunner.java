package class19.E1;

public class StringReplaceRunner {
    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace();
        System.out.println(stringReplace.replaceI());
        System.out.println(stringReplace.calculateLength(stringReplace.replaceI()));
        System.out.println(stringReplace.replaceSS());
        System.out.println(stringReplace.calculateLength(stringReplace.replaceSS()));
    }
}

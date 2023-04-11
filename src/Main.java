public class Main {
    public static void main(String[] args) {
        String line1 = "абвгабвг";
        String line2 =  "абв";

        int calculate = Entering (line1, line2);
        System.out.println(calculate);
    }

    public static int Entering (String line1, String line2){
        if (line2.isEmpty())
            throw new RuntimeException();
        return line1.split(line2, -1).length - 1;
    }
}



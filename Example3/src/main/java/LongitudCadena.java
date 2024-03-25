public class LongitudCadena {
    public static void main (String args[]) {
        if (args.length == 1) {
            String argX = "";
            argX = args[0];
        
            System.out.println("The length of the string is: "+argX.length());
        } else {
            System.out.println("Enter 1 argument");
        }
    }
}

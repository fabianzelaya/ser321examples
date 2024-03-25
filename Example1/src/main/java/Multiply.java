public class Multiply {
   public static void main (String args[]) {
    if (args.length == 2) {
        int argX = 0;
        int argY = 0;
        try {
          argX = Integer.parseInt(args[0]);
          argY = Integer.parseInt(args[1]);
        } catch (Exception e) {
          System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
          System.exit(1);
        }
        System.out.println(argX + " * " + argY + " = " + argX * argY);
      } else {
          System.out.println("Exactly 2 arguments should be provided.\n gradle run --args='1 2'");
      }
    }
}

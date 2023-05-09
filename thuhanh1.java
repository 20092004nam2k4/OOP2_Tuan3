package thuhanh;

import java.util.Scanner;

public class thuhanh1 {
  public static void main(String[] args) {
    System.out.println ("Trình giải phương trình tuyến tính");
    System.out.println ("Cho một phương trình là 'a * x + b = 0', vui lòng nhập các hằng số: ");

    Scanner scanner = new Scanner (System.in);

    System.out.print("a: ");
    double a = scanner.nextDouble ();

    System.out.print("b: ");
    double b = scanner.nextDouble ();

    if ( a!= 0){
      double solution = -b/a;
      System.out.printf ( "The solution is: %f!" , solution );
    } else {
      if (b == 0) {
        System.out.print("The solution is all x!");
      } else {
        System.out.print("No solution!");
      }
    }

  }
}

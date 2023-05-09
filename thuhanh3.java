package thuhanh;

import java.util.Scanner;

public class thuhanh3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner ( System.in );
    System.out.println ("Hãy nhập x: " );
    int x = scanner.nextInt ();

    System.out.println ("Hãy nhập y: ");
    int y = scanner.nextInt ();

    thuhanh3 meo = new thuhanh3 ();
    meo.demo (x , y);

  }

  private void demo(int x , int y) {
    try {
      int a = x + y;
      int b = x - y;
      int c = x * y;
      int d = x / y;
      System.out.println ( "Tổng: " + a );
      System.out.println ( "Hiệu: " + b );
      System.out.println ( "Tích: " + c );
      System.out.println ( "Thương: " + d );
    } catch (Exception n) {
      System.out.println ( "xảy ra ngoại lệ: " + n.getMessage ( ) );
    }
  }
}

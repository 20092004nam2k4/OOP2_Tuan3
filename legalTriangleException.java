package baitap;

import java.util.Scanner;

public class legalTriangleException {
  public static void main(String[] args) {
    Scanner sc = new Scanner ( System.in );


    try {
      System.out.println ( "nhập cạnh a: " );
      double a = sc.nextDouble ( );
      System.out.println ( "nhập cạnh b: " );
      double b = sc.nextDouble ( );
      System.out.println ( "nhập cạnh c: " );
      double c = sc.nextDouble ( );
      if (a <= 0 || b <= 0 || c <= 0) {
        throw new IllegalTriangleException("Giá trị cạnh không hợp lệ. Hãy nhập các giá trị dương!");

      }
      if (a + b <= c || b + c <= a || a + c <= b) {
        throw new IllegalTriangleException("Ba cạnh này không tạo thành một tam giác hợp lệ!");
      }
    } catch (IllegalTriangleException e) {
      throw new RuntimeException ( e );
    }
  }
 public static class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
      super(message);
    }
  }

}

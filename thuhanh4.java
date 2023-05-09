package thuhanh;

import java.util.Scanner;

public class thuhanh4 {
  public static void main(String args[])
  {
    Scanner scn = new Scanner(System.in);
    try
    {
      // scn có kiểu Scanner
      //scn.nextLine() : dùng để nhập vào một chuỗi
      //sau đó Integer.parseInt() dùng để chuyển đổi chuỗi thành một giá trị nguyên

      int n = Integer.parseInt(scn.nextLine());
      //nếu ước 99%n == 0 thì in ra "n is a factor of 99"
      if (99%n == 0)
        System.out.println(n + " is a factor of 99");
    }
    // catch() đầu tiên sử dụng đối tượng ArithmeticException để
    // bắt các ngoại lệ liên quan đến toán học (arithmetic)
    catch (ArithmeticException ex) {
      System.out.println("Arithmetic " + ex);
    }
    //Khối catch() thứ hai sử dụng đối tượng NumberFormatException để bắt các ngoại
    // lệ liên quan đến định dạng số (number format)
    catch (NumberFormatException ex) {
      System.out.println("Number Format Exception " + ex);
    }
  }

}

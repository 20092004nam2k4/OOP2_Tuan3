package thuhanh;

import java.util.Random;
import java.util.Scanner;

public class thuhanh2 {

  public static void main(String[] args) {
    thuhanh2 thụhanh = new thuhanh2 ();
    Integer[] arr = thuhanh2.CreateRandom();

    Scanner scaner = new Scanner(System.in);
    System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
    int x = scaner.nextInt();
    try {
      System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
    } catch (IndexOutOfBoundsException e) {
      System.err.println("Chỉ số vượt quá giới hạn của mảng");
    }



  }

  public static Integer[] CreateRandom(){
    Random sc = new Random ();
    Integer[] arr = new Integer[100];
    System.out.println("Danh sách phần tử của mảng: " );
    for (int i = 0; i < 100; i++) {
      arr[i] = sc.nextInt(100);
      System.out.print(arr[i]+ " ");
    }
    return arr;
  }

}

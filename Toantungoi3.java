package baitap;

public class Toantungoi3 {
  public static void main (String[] args)
  {
    // Initializing String variable with null value
    String str = null;
    String message = (str == null) ? "" :
      str.substring(0,5);
    System.out.println(message);

    // Initializing String variable with null value
    str = "Geeksforgeeks";
    message = (str == null) ? "" : str.substring(0,5);
    System.out.println(message);
  }
  //Đoạn mã sẽ in ra kết quả "Geeks" và ngoại lệ NullPointerException được ném ra ở dòng 7,
  // bởi vì khi chuỗi str có giá trị null, thì phương thức substring() sẽ ném ra ngoại lệ NullPointerException.
  // Tuy nhiên, trong trường hợp chuỗi str có giá trị là "Geeksforgeeks", thì kết quả được in ra là "Geeks"


  //cú pháp tổng quát toán tử 3 ngôi:
  // ========(condition) ? value_if_true : value_if_false;========//
  //condition là một biểu thức có kiểu dữ liệu boolean.
  //value_if_true là giá trị được trả về nếu condition có giá trị là true.
  //value_if_false là giá trị được trả về nếu condition có giá trị là false.
}

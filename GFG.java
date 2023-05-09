package baitap;

public class GFG {
  public static void main(String[] args) {
    String ptr = null;

    if (ptr.equals ( "gfg" )) {
      System.out.print ( "Same" );
    } else
      System.out.print ( "Not Same" );
// khi chạy chương trình, ngoại lệ NullPointerException vì biến ptr được gán cho giá trị null,
// nhưng sau đó chương trình yêu cầu so sánh giá trị của biến "ptr" với chuỗi "gfg". Vì "ptr" là null,
// việc sử dụng phương thức equals() để so sánh giá trị của nó sẽ sinh ra ngoại lệ NullPointerException.
//
//equals() : so sánh;
//
    try {
      // This line of code throws NullPointerException
      // because ptr is null
      if (ptr.equals ( "gfg" ))
        System.out.print ( "Same" );
      else
        System.out.print ( "Not Same" );
    } catch (NullPointerException e) {
      System.out.print ( "NullPointerException Caught" );
    }
//    khi chạy đoạn mã trên một ngoại lệ NullpointerException sẽ được sinh ra, đây là do biến prt
//    được khởi tạo vs giá trị null và khi thực hiện phép so sánh thì phương thức equals() không được gọi
//    vì không có đối tượng để gán cho biến ''ptr'' dẫn đến việc sinh ra ngoại lệ.
//    Trong đoạn mã, việc bắt ngoại lệ NullPointerException được thực hiện trong khối catch,
//     và thông báo "NullPointerException Caught" sẽ được hiển thị trên màn hình.
    try
    {
      if ("gfg".equals(ptr))
        System.out.print("Same");
      else
        System.out.print("Not Same");
    }
    catch(NullPointerException e)
    {
      System.out.print("Caught NullPointerException");
    }

  }
}


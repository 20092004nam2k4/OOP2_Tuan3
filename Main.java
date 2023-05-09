package baitap;

class NgoaiLeNguoiDung extends Exception{
  public NgoaiLeNguoiDung(String s)
  {
    // Call constructor of parent Exception
    super(s);
  }
}

// A Class that uses above MyException
 class Main {
  // Driver Program
  public static void main(String args[])
  {
    try {
      // Throw an object of user defined exception
      throw new NgoaiLeNguoiDung("GeeksGeeks");
    }
    catch (NgoaiLeNguoiDung ex) {
      System.out.println("Caught");

      // Print the message from MyException object
      System.out.println(ex.getMessage());
    }
  }
}




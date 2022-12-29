import java.util.Scanner;

public class no_1330 {
  public static void main(String[] args) throws Exception{
    Scanner sc =  new Scanner(System.in);
    String input = sc.nextLine();
    String[] ab = input.split(" ");
    int a = Integer.parseInt(ab[0]);
    int b = Integer.parseInt(ab[1]);
    if (a > b)
      System.out.println(">");
    else if (a < b) 
      System.out.println("<");
    else
      System.out.println("==");
  }
  
}

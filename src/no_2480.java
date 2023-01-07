import java.util.Scanner;

public class no_2480 {
  public static void main(String[] args) throws Exception{
    Scanner sc =  new Scanner(System.in);
    String input = sc.nextLine();
    String[] abc = input.split(" ");
    int a = Integer.parseInt(abc[0]);
    int b = Integer.parseInt(abc[1]);
    int c = Integer.parseInt(abc[2]);

    if(a == b && b == c && a == c)
    {
      System.out.println(10000+(a*1000));
    }
    else if (a == b || a == c){
      System.out.println(1000+(a*100));
    } 
    else if (b==c){
      System.out.println(1000+(b*100));
    }
    else 
      System.out.println(Math.max(a, Math.max(b, c))*100);
  }
}
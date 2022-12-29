import java.util.Scanner;

public class no_9498 {
  public static void main(String[] args) throws Exception {
    Scanner sc =  new Scanner(System.in);
    String input = sc.nextLine();
    int grade = Integer.parseInt(input);
    if (grade >= 90)
      System.out.println("A");
    else if(grade >= 80)
      System.out.println("B");
    else if(grade >= 70)
      System.out.println("C");
    else if(grade >= 60)
      System.out.println("D");
    else
      System.out.println("F");
  }
  
}

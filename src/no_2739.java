import java.util.Scanner;

public class no_2739 {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for(int i=1; i<10; i++){
      System.out.println(n +" * "+i+" = " +(n*i));
    }
  }
}

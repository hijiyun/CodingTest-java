import java.util.Scanner;

public class no_14681 {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();

    if(X < 0){
      if (Y > 0)
        System.out.println("2");
      else
        System.out.println("3");
    }else {
      if(Y < 0)
        System.out.println("4");
      else
        System.out.println("1");
    }
	}
}

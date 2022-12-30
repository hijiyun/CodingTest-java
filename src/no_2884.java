import java.util.Scanner;

public class no_2884 {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    String input = sc.nextLine();
    String[] time = input.split(" "); 
    int H = Integer.parseInt(time[0]);
    int M = Integer.parseInt(time[1]);
    sc.close();

    if(M < 45){
      H--;
      M = 60 - (45 - M);
      if(H < 0){
        H = 23;
      }
      System.out.println(H+" "+M);
    }else{
      System.out.println(H + " "+ (M - 45));
    }
	}
}

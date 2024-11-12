#import java.util.Scanner;
class main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if (x%2){
      System.out.println("EVEN");
    }
    else{
      System.out.println("ODD");
    }
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int a = sc.nextInt();
     int count = 0;
     int n= a-1;
     int j=a;
    for(int i=1;i<j;i++)
    {   
        if(n%i==0){
          j=n/i;
            if(i!=j){
            count+=2;
            }
            else{
            count++;
            }
        }
    }
    if (count==2){
  System.out.print("prime number");
    } else {
    System.out.print("none prime numbember12");
}

}

import java.util.*;

public class STACKS_STR_PALINDROM {
    public static String condition(long n){
        long digit=n;
        System.out.println(digit);
        long temp = 0;
        long rem = 0;
        int i=0;
        while(n!=0){
          i++;
            rem = n%10;
            temp = temp*10+rem;
            n=n/10;
        }
        System.out.println(temp);
       String st1 = String.valueOf(digit);
       String st2 = st1+temp;
       return st2;
       
 }

    public static String solve(int A) {
        Queue<Long> q = new LinkedList<>();
        q.offer(1L);
        q.offer(2L);
        long ans= 1;    // use to store the nth value of the queue thta pushed in recently
        int count =2;
        if(A==2){
          ans=2;
        }
        while(!q.isEmpty() && count<A){
        long value =q.poll(); 
         System.out.println(value + " jh");
         long n=0;    // using to manuplate the value pop from the Queue
         int i=1;
        while(count<A && i<=2){
           n = value*10+i;
           ans = n;
           q.offer(n);
           count++;
           i++;
          }
        }
     return condition(ans);
    }
    
    public static void main(String[] args) {
      int n = 4;
      System.out.print( solve(n));
  }
}
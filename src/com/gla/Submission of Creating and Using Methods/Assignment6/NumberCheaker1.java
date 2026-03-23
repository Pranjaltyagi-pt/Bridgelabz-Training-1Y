package Assignment6;
import java.util.Arrays;
import java.util.Scanner;
public class NumberCheaker1 {
    public static int countnumber(int n){
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
    public static int[] numberarray(int n){
        int[] array=new int[countnumber(n)];
        for(int i=array.length-1;i>=0;i--){
            array[i]=n%10;
            n=n/10;
        }
        return array;
    }
    public static boolean checkducknumber(int n){
        int d=1;
        while(n!=0) {
            d = n % 10;
            if (d == 0) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
    public static boolean armstrongnumber(int n){
        int i=0;
        int o=n;
        double s=0;
        while(n!=0){
            int d=n%10;
            s=s+Math.pow(d,3);
            n=n/10;
        }
        if(s==o){
            return true;
        }
        else {
            return false;
        }
    }
    public static int[] largestandsecondlargest(int[] n){
        int l=n[0];
        int s=n[0];
        for(int i=0;i<n.length;i++){
            if(l<n[i]){
                s=l;
                l=n[i];
            }
            else if(s<n[i]&&s!=l){
                s=n[i];
            }
        }
        return new int[]{l,s};
    }
    public static int[] smallestandsecondsmallest(int[] n){
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(s>n[i]){
                ss=s;
                s=n[i];
            }
            else if(ss>n[i]&&ss!=s){
                ss=n[i];
            }
        }
        return new int[]{s,ss};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int[] l=largestandsecondlargest(numberarray(n));
        int[] s=smallestandsecondsmallest(numberarray(n));
        System.out.println("Digit number = "+countnumber(n));
        System.out.println("Digits array: "+ Arrays.toString(numberarray(n)));
        System.out.println("Is Duck Number: "+checkducknumber(n));
        System.out.println("Is Armstrong Number: "+armstrongnumber(n));
        System.out.println("Largest Digit = "+l[0]);
        System.out.println("Second Largest Digit = "+l[1]);
        System.out.println("Smallest Digit = "+s[0]);
        System.out.println("Second Smallest Digit = "+s[1]);

    }
}

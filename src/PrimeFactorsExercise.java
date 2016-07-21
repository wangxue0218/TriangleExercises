import java.util.*;

/**
 * Created by xuewang on 7/21/16.
 */
public class PrimeFactorsExercise {
    public static void main(String[]args){
        System.out.println(Generate(1));
        System.out.println(Generate(2));
        System.out.println(Generate(30));
        System.out.println(Generate(50));
        System.out.println(Generate(9));
    }
    public static List<Integer> Generate(int n){
        List<Integer> primeFactors = new ArrayList<>();
        for(int i =2;i<n;i++)
            if(n%i==0 && IsPrime(i))
                primeFactors.add(i);
        return primeFactors;
    }
    public static boolean IsPrime(int num){
        boolean sign = true;
        for(int i=2;i<num;i++)
            if(num%i==0)
                sign = false;
        return sign;
    }
}

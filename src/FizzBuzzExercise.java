/**
 * Created by xuewang on 7/21/16.
 */
public class FizzBuzzExercise {
    public static void main(String[] args){
        FizzBuzzExercise(100);
    }
    public static void FizzBuzzExercise(int n){
        for(int i=1;i<=n;i++){
            if(i%5==0&&i%3==0)
                System.out.println("FizzBuzz");
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}

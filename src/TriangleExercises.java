/**
 * Created by xuewang on 7/20/16.
 */
public class TriangleExercises {

    public static void EasiestExercise(){
        System.out.print("*");
    }
    public static void DrawHorizontalLine(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
    public static void DrawVerticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }
    public static void DrawRightTriangle(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args){
        //EasiestExercise();
        //DrawHorizontalLine(8);
        //DrawVerticalLine(3);
        //DrawRightTriangle(3);

    }
}

/**
 * Created by xuewang on 7/21/16.
 */
public class DiamondExercises {
    public static void main(String[] args){
        IsoscelesTriangle(3);
        System.out.println();
        Diamond(5);
        System.out.println();
        DiamondWithName(4);
    }
    public static void IsoscelesTriangle(int n){
        for(int row =0;row<n;row++){
            for(int i =0; i<n-row-1; i++)
             System.out.print(" ");
            for(int j =0;j<2*row+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void Diamond(int n){
        for(int row =0;row<n;row++){
            for(int i =0; i<n-row-1; i++)
                System.out.print(" ");
            for(int j =0;j<2*row+1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int row = n-1;row >0;row--){
            for(int i=0;i<n-row;i++)
                System.out.print(" ");
            for(int j=2*row-1;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void DiamondWithName(int n){
        for(int row =0;row<n-1;row++){
            for(int i =0; i<n-row-1; i++)
                System.out.print(" ");
            for(int j =0;j<2*row+1;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("Bill");
        for(int row = n-1;row >0;row--){
            for(int i=0;i<n-row;i++)
                System.out.print(" ");
            for(int j=2*row-1;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
    }
}

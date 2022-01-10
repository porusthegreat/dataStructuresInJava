import java.util.Scanner;

public class ChessBoardPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 10;
        int cols = rows;
        boolean flag = true;

        for(int i = 1; i <= rows; i++ ){
            for (int j = 1; j<=cols; j++){
                if(flag){
                    System.out.print("W");
                }else{
                    System.out.print("B");
                }
                flag = !flag;
            }
            System.out.println("");
            if(cols % 2 == 0)
                flag = !flag;
        }



    }
}

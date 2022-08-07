import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row=scanner.nextInt();
        System.out.println("Nhập số cột");
        int col=scanner.nextInt();
        double[][] arr=new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập giá trị ở hàng "+i+" cột "+j);
                arr[i][j]=scanner.nextDouble();
                
            }
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"\t\t");

            }
            System.out.println("");
        }
        double sum=0;
        System.out.println("Tính tổng ở cột nào?");
        int colsum=scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][colsum];

        }
        System.out.println("Tổng cột thứ "+colsum+" là "+ sum);
    }
}

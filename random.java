import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("even or odd");
        int bob = scanner.nextInt();
        int total = bob%2;
        if(total==1){
            System.out.println("odd");
        }else if(total == 0){
            System.out.println("even");
        }
    }
    
}

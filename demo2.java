import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int value1=0;
        int value2=0;
        char operation;
        int result=0;

        System.out.println("Введите 2  целых числа: ");
        Scanner scanner = new Scanner(System.in);
        if (value1 >= 0 || value1 < 10) {
            value1 = scanner.nextInt();
            operation = scanner.next().charAt(1);
            value2 = scanner.nextInt();
              switch(operation) {
                case '+': result = value1 + value2;
                    break;
                case '-': result = value1 - value2;
                    break;
                case '*': result = value1 * value2;
                    break;
                case '/': result = value1 / value2;
                    break;
                default:  System.out.printf("error!");
                    return;
              }
            System.out.println(result);
        }
        else {
            System.out.println("error!");
        }    
              }
}
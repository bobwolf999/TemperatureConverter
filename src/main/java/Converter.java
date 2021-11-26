import java.util.Scanner;

public class Converter {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("For converting celsius to fahrenheit enter 1");
        System.out.println("For converting fahrenheit to celsius enter 2");
        int option = sc.nextInt();

        if(option == 1){
            System.out.println("Enter temperature in celsius");
            int temperatureC = sc.nextInt();
            double valueF = temperatureC * 1.8 + 32;
            System.out.println("Temperature in fahrenheit is: " + valueF);

        }else if(option == 2){
            System.out.println("Enter temperature in fahrenheit");
            int temperatureF = sc.nextInt();
            double valueC = (temperatureF - 32) * 1.8;
            System.out.println("Temperature in fahrenheit is: " + valueC);

        }else{
            System.out.println("Invalid choice");
        }
        sc.close();

    }
}

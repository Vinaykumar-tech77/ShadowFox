import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Available Oprations are:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square Root");
        System.out.println("6.Exponential");
        System.out.println("7.Tempreature coversion");
        System.out.println("8.Currency Coversion");
        System.out.println("Enter the option(Only In Number):");
        int option = sc.nextInt();
        switch(option){

            case 1:
            System.out.println("1.Addition");
            System.out.println("Enter A:");
            double a = sc.nextInt();
            System.out.println("Enter B:");
            double b = sc.nextInt();
            double c = a+b;
            System.out.println("Addition of "+a+" and "+b+" is "+c);

            case 2:
            System.out.println("2.Subtraction");
            System.out.println("Enter A:");
            a = sc.nextInt();
            System.out.println("Enter B:");
            b = sc.nextInt();
            c = a-b;
            System.out.println("Subtraction of "+a+" and "+b+" is "+c);

            case 3:
            System.out.println("3.Multiplication");
            System.out.println("Enter A:");
            a = sc.nextInt();
            System.out.println("Enter B:");
            b = sc.nextInt();
            c = a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is "+c);

            case 4:
            System.out.println("4.Division");
            System.out.println("Enter A:");
            a = sc.nextInt();
            System.out.println("Enter B:");
            b = sc.nextInt();
            c = a/b;
            System.out.println("Division of "+a+" and "+b+" is "+c);

            case 5:
            System.out.println("5.Square Root");
            System.out.println("Enter A:");
            a = sc.nextInt();
            c = Math.sqrt(a);
            System.out.println("Square root of "+a+" is "+c);

            case 6:
            System.out.println("6.Exponential");
            System.out.println("Enter Base:");
            a = sc.nextInt();
            System.out.println("Enter exponent:");
            b = sc.nextInt();
            double result = 1;
            for(int i = 0;i<b;i++){
                result = result*a;
            }
            System.out.println("The exponentiation of Base "+a+"exponent "+b+" is "+result);

            case 7:
            System.out.println("7.Tempreature coversion");
            System.out.println("Enter the tempreature in celcius :");
            a = sc.nextInt();
            double F = a * 33.8;
            double K = a+273.15;
            System.out.println("The Tempreature In Fahrenheit is "+F+" and in Kelvin it is "+K+"K");

            case 8:
            System.out.println("8.Currency Coversion");
            System.out.println("Enter the amount in Indian Rupees :");
            a = sc.nextInt();
            double D = a/86.98;
            double Y = a*1.7;
            double I = a*188.72;
            System.out.println("The "+a+" Indian rupee is equal to "+D+" US Dollar\n"+Y+" Japanese Yen\n"+I+" Indonesian Rupiah");
            break;
            default:
            System.out.println("Invalid Option Enter a Valid Option!!");

            sc.close();
    }
}
}
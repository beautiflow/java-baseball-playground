package PlayGround.stringCalculator;

import java.util.Scanner;

public class StringCalculator {

    public String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public String[] split(String value){
        return value.split(" ");
    }

    public int toInt(String value){
        return Integer.parseInt(value);
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int calculate(int a, String operator, int b){
        if(operator.equals("+")){
            return add(a, b);
        }
        if(operator.equals("-")){
            return subtract(a, b);
        }
        if(operator.equals("*")){
            return multiply(a, b);
        }
        if(operator.equals("/")){
            return divide(a, b);
        }
        throw new IllegalStateException();
    }

    public int stringCalculate(String value){
        String[] result = split(value);
        int a = toInt(result[0]);
        for(int i = 2; i < result.length; i += 2){
            int number = toInt(result[i]);
            a = calculate(a, result[i - 1], number );
            }
        return a;
        }

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        String value = stringCalculator.input();
        System.out.println(stringCalculator.stringCalculate(value));
    }
}


package model;

public class Calculator {

    public static float calculate(float firstOperand, float secondOperand, String operator) throws ArithmeticException{
        float result = 0;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if(secondOperand == 0) throw new ArithmeticException("Can not divided by 0");
                result = firstOperand / secondOperand;
                break;
        }
        return result;
    }

}

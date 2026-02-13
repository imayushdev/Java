package ControlFlow.SwitchStatements;

public class switchAsExpression {
    static String dayOfWeek(String day){
        return switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> {yield  ("Weekday");
            }
            case "Saturday" , "Sunday"->("Weekend");
            default ->("Invalid day choice");
        };
    }
    public static void main(String[] args) {
       String  result = dayOfWeek("Monday");
        System.out.println(result);




    }
}

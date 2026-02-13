package ControlFlow.SwitchStatements;

public class traditionalAsExpression {
    static String dayOfWeek(String day) {
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                return ("Weekday");

            case "Saturday", "Sunday":
                return ("Weekend");
            default:
                return ("Invalid day choice");
        }
    }

    public static void main(String[] args) {
        String result = dayOfWeek("Tuesday");
        String resulta = dayOfWeek("Monday");

        System.out.println("Result is : " + result);
        System.out.println(resulta);
    }
}





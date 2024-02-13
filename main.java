public class Main{
    static int ageInHere = 17;

    public static void main(String[] args) throws InterruptedException {
        boolean isOldEnoughToDrink = oldEnough(ageInHere);
        
        String receivedBarMessage = barMessage(isOldEnoughToDrink, true);

        // System.out.println(receivedBarMessage);

        int a = 3;
        int b = 2;

        int sum = sum(a,b);
        int subtract = subtract(a,b);
        int multiply = multiply(a,b);
        float divide = divide(a,b);

        // System.out.println("sum = " + sum);
        // System.out.println("subtract = " + subtract);
        // System.out.println("multiply = " + multiply);
        // System.out.println("divide = " + divide);

        for (int i = 4; i >= 0; i--) {
            System.out.println("Server restarting in: " + (i+1) + " minutes");
            Thread.sleep(3000);
        }

        System.out.println("Server restarting");

    }

    public static boolean oldEnough(int age){
        boolean isOldEnoughToDrink;
        if(age >= 18){
            isOldEnoughToDrink = true;
        }else {
            isOldEnoughToDrink = false;
        }
        return isOldEnoughToDrink;
    }

    public static String barMessage(boolean isDrinkingAge, boolean isWithParents){
        String outputText;
        String firstName = "Eros";
        String lastName = "Coelho";
        if(isDrinkingAge == true){
            outputText = firstName + " is old enough to drink, cheers! he is: " + ageInHere;
        } else if(isDrinkingAge == false && isWithParents == true ){
            outputText = firstName + " Enjoy the steaks with your parents :) " + ageInHere;
        }
        else {
            outputText = firstName + " is not old enough to drink, goodbye baby, he is: " + ageInHere;
        }

        return outputText;
    }


    public static int sum(int a,int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static float divide(int a, int b){
        return a / b;
    }
}

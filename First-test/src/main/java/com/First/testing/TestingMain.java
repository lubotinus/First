package com.First.testing;
 import com.First.testing.calculator.Calculator;
 import com.First.testing.user.SimplyUser;
public class TestingMain {
    public static void main(String[] args) {
        SimplyUser simplyUser = new SimplyUser("theForumUser");
        String result = simplyUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("Test OK");
             }else {
            System.out.println("Error!");
        }
        System.out.println("Test - perwszy test jednostkowy");

        Calculator calculator = new Calculator(10,25);

        calculator.add();
        calculator.subtract();
    }
}

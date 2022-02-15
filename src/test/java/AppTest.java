package test.java;

import main.java.App;

public class AppTest {
    public static void main(String[] args) {
        App miApp = new App();

        if(miApp.function()){
            System.out.println("The app works great!");
        }
        else{
            System.err.println("The app does not work :(");
        }
    }
}

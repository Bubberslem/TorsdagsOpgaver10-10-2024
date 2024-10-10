package TaskTwo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
       ArrayList<String> coffeeMenu = cafe.getCoffeeMenu();
        for (String menu : coffeeMenu) {
            System.out.println(menu);
        }
    }
}

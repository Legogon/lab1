package dz_9;

import java.util.Scanner;

public class LabWork1 {
	
    public static void main(String[] args) {
    	
        System.out.println("TEST1");

        Scanner inTotal = new Scanner(System.in);
        System.out.println("Введите общее число квартир");
        int total = inTotal.nextInt();

        //Создаем массивы-объекты

        Flat[] flat = new Flat[total];

        //заполняем основной массив
        Menu menu = new Menu();
        Flat[] flat2 = menu.createMass(flat);
        for (int i = 0; i < flat2.length; i++) {
            System.out.println(flat2[i].Index);
        }

        //Заполняем массив объектами, удовлетворяющими запросу
        System.out.println("Введите стоимость максимальную для вас стоимость");
        int maxCoast = inTotal.nextInt();
        
        menu.createMassFil(flat, maxCoast);//      
    }
}

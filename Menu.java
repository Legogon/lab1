package dz_9;

import java.util.Scanner;

public class Menu {
	int index;
	int space;
	int coast;
	int total;
	
	//Заполнение массива квартир
	public Flat[] createMass(Flat[] flat){
		
            for(int i = 0; i < flat.length; i++){
                    Scanner inP = new Scanner(System.in);
                    System.out.println("Введите номер/идекс квартиры");
                    index = inP.nextInt();
                    System.out.println("Введите площадь квартиры");
                    space = inP.nextInt();
                    System.out.println("Введите стоимость кв/м");
                    coast = inP.nextInt();

                    flat[i] = new Flat(index, space, coast);
            }
            return flat;
	}
	
	//Заполнение и вывод на экран массива квартир, удовлетваряющих требованию
	public void createMassFil(Flat flat[], int maxCoast){
            for(int i = 0; i < flat.length; i++){
                if (flat[i].totalCoast < maxCoast){
                    System.out.println("Индекс - " + flat[i].index);
                    // и тд.
                }
            }
        }

}

package dz_9;

import java.util.Scanner;

public class Menu {
	int Index;
	int Space;
	int Coast;
	int Total;
	
	//Заполнение массива квартир
	public Flat[] createMass(Flat[] flat){
		
            for(int i = 0; i < flat.length; i++){
                    Scanner inP = new Scanner(System.in);
                    System.out.println("Введите номер/идекс квартиры");
                    Index = inP.nextInt();
                    System.out.println("Введите площадь квартиры");
                    Space = inP.nextInt();
                    System.out.println("Введите стоимость кв/м");
                    Coast = inP.nextInt();

                    flat[i] = new Flat(Index, Space, Coast);
            }
            return flat;
	}
	
	//Заполнение и вывод на экран массива квартир, удовлетваряющих требованию
	public void createMassFil(Flat flat[], int maxCoast){
		
            for(int i = 0; i < flat.length; i++){
                if (flat[i].TotalCoast < maxCoast){
                    System.out.println("Индекс - " + flat[i].Index);
                }
            }
        }

}

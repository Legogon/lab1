package dz_9;
//
public class Flat extends Menu {
	
	int TotalCoast;
	
	public Flat(int index, int space, int coast){
		Index = index;
		Space = space;
		Coast = coast;
		TotalCoast = totalCoast();
	}
	
	//расчет стоимости квартиры
	public int totalCoast(){
		int totalcoast = Coast * Space;
		return totalcoast;
	}

}

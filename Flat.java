package dz_9;
//
public class Flat extends Menu {
	
	int totalCoast;
	
	public Flat(int index, int space, int coast){
		this.index = index;
		this.space = space;
		this.coast = coast;
		totalCoast = totalCoast();
	}
	
	//расчет стоимости квартиры
	public int totalCoast(){
		int totalcoast = coast * space;
		return totalcoast;
	}

}

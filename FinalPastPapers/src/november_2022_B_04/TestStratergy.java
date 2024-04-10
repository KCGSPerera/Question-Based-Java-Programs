package november_2022_B_04;

// Completed


interface IPrepareQuickly{
	
	void deliveryTime();
}

interface IPrepareDeliciously{
	void addFlavour();
	double getCost();
}

class ChickenFlavour implements IPrepareDeliciously{
	double cost;
	
	
	public ChickenFlavour() {
		super();
		this.cost = 100.00;
	}
	
	public void addFlavour() {
		System.out.println("Chicken Flavour");
	}
	public double getCost() {
		return cost;
	}
}

class FishFlavour implements IPrepareDeliciously{
	double cost;
	
	public FishFlavour() {
		super();
		this.cost = 80.00;
	}
	public void addFlavour() {
		System.out.println("Fish Flavour");
	}
	public double getCost() {
		return cost;
	}
}

class EggFlavour implements IPrepareDeliciously{
	double cost;
	
	public EggFlavour() {
		super();
		this.cost = 60.00;
	}
	public void addFlavour() {
		System.out.println("Egg Flavour");
	}
	public double getCost() {
		return cost;
	}
}

class OneHour implements IPrepareQuickly{
	
	public void deliveryTime() {
		System.out.println("Deliver within 60 minutes");
	}
}

class ThirtyMinutes implements IPrepareQuickly{
	
	public void deliveryTime() {
		System.out.println("Deliver within 30 minutes");
	}
}


class FourtyFiveMinutes implements IPrepareQuickly{
	
	public void deliveryTime() {
		System.out.println("Deliver within 45 minutes");
	}
}


abstract class Meal{
	
	IPrepareDeliciously iPrepareDeliciously;
	IPrepareQuickly iPrepareQuickly;
	
	public void setFlavour(IPrepareDeliciously iPrepareDeliciously) {
		this.iPrepareDeliciously = iPrepareDeliciously;
	}
	public void setIDuration(IPrepareQuickly iPrepareQuickly) {
		this.iPrepareQuickly = iPrepareQuickly;
	}
	public void mealWithFlavour() {
		iPrepareDeliciously.addFlavour();
	}
	public void mealInDuration() {
		iPrepareQuickly.deliveryTime();
	}
	
	public abstract void displayMeal();
	public abstract void displayCost(); 
	
}


class Breakfast extends Meal{
	
	public void setFlavour(IPrepareDeliciously iPrepareDeliciously) {
		super.iPrepareDeliciously = iPrepareDeliciously;
	}
	
	public void setIDuration(IPrepareQuickly iPrepareQuickly) {
		super.iPrepareQuickly = iPrepareQuickly;
	}
	
	public void mealWithFlavour() {
		iPrepareDeliciously.addFlavour();
	}
	
	public void mealInDuration() {
		iPrepareQuickly.deliveryTime();
	}
	
	public void displayMeal() {
		mealWithFlavour();
		mealInDuration();
		displayCost();
	}
	public void displayCost() {
		System.out.println("Cost : " + iPrepareDeliciously.getCost());	}
}

class Lunch extends Meal{
	
	public void setFlavour(IPrepareDeliciously iPrepareDeliciously) {
		super.iPrepareDeliciously = iPrepareDeliciously;
	}
	
	public void setIDuration(IPrepareQuickly iPrepareQuickly) {
		super.iPrepareQuickly = iPrepareQuickly;
	}
	
	public void mealWithFlavour() {
		iPrepareDeliciously.addFlavour();
	}
	
	public void mealInDuration() {
		iPrepareQuickly.deliveryTime();
	}
	
	public void displayMeal() {
		mealWithFlavour();
		mealInDuration();
		displayCost();
	}
	public void displayCost() {
		System.out.println("Cost : " + iPrepareDeliciously.getCost());	}
}

class Dinner extends Meal{
	
	public void setFlavour(IPrepareDeliciously iPrepareDeliciously) {
		super.iPrepareDeliciously = iPrepareDeliciously;
	}
	
	public void setIDuration(IPrepareQuickly iPrepareQuickly) {
		super.iPrepareQuickly = iPrepareQuickly;
	}
	
	public void mealWithFlavour() {
		iPrepareDeliciously.addFlavour();
	}
	
	public void mealInDuration() {
		iPrepareQuickly.deliveryTime();
	}
	
	public void displayMeal() {
		super.mealWithFlavour();
		super.mealInDuration();
		displayCost();
	}
	public void displayCost() {
		System.out.println("Cost : " + iPrepareDeliciously.getCost());
	}
}
public class TestStratergy {

	public static void main(String[] args) {
		Meal meal = new Breakfast();
		meal.setFlavour(new ChickenFlavour());
		meal.setIDuration(new ThirtyMinutes());
		meal.displayMeal();
		
		Meal meal2 = new Lunch();
		meal2.setFlavour(new FishFlavour());
		meal2.setIDuration(new OneHour());
		meal2.displayMeal();
		
		Meal meal3 = new Dinner();
		meal3.setFlavour(new EggFlavour());
		meal3.setIDuration(new FourtyFiveMinutes());
		meal3.displayMeal();
			
		
	}

}

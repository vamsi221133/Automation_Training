package FifthProgram;

public class Lion extends Animal implements Habitaites{

	public static void main(String[] args) {
		Lion l = new Lion();
		//l.noOfLegs();
		l.eating_jabits();
		l.habitaties();
		
		
		//encapsulation for number of lega
		Animal obj =(Animal) l;
		obj.setNoOfLegs("five");
		System.out.println(obj.getNoOfLegs());
		
		
		
		
		//upcasting
		
//		Animal li = new Lion();
//		li.noOfLegs();
//		li.eating_jabits();
//		Habitaites lo = new Lion();
//		lo.habitaties();
		//downcasting
//		Lion ob = (Lion) li;
//		ob.noOfLegs();
//		ob.eating_jabits();
//		ob.habitaties();
	}
		
	@Override
	public void habitaties() {
		
		System.out.println("Lions live in different habitats in Asia and Africa, including savannas, open woodlands, and scrublands. They are carnivores and hunt animals like zebras, rhinos, and antelopes that live in their habitat.");
	}
	
}

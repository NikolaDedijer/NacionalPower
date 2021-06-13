package nacmoc;

import java.util.*;

public class NacMoc {

	
	final static int MAX_UNOSA = 100; //max broj unosa

	
	public static void main(String[] args) {

		int n;
		HashMap<String, Double> listaDrzava = new HashMap<>();
		
		
		
		do {
		
		String ime;
		int p;
		int k;
		int m;
		double NacionalnaMoc;
		
		Scanner tastatura = new Scanner(System.in);
	
		System.out.print("Molim vas unesite naziv zemlje: ");
		ime = tastatura.next();
		System.out.print("Molim vas unesite broj stanovnika drzave "+ ime + ":");
		p = tastatura.nextInt();
		System.out.print("Molim vas unesite broj nuklearnih glava drzave "+ ime + ":");
		k = tastatura.nextInt();
		System.out.print("Molim vas unesite BDP drzave "+ ime + ":");
		m = tastatura.nextInt();
		
		NacionalnaMoc=p+k+m/100;
		
		System.out.println();
		System.out.print("Nacionalna moc drzave" + ime + ":");
		System.out.println(NacionalnaMoc);
		
		System.out.println("zelite da unesete za drugu zemlju - 1");
		System.out.println("zelite rang listu - 2");
		n = tastatura.nextInt();
		
		listaDrzava.put(ime, NacionalnaMoc);
		
	} while (n == 1); 
    

		if (n == 2) {
			LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
			listaDrzava.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.forEachOrdered(x ->sortedMap.put(x.getKey(),x.getValue()));
			int counter = 1;
			for (Map.Entry<String, Double> entry:sortedMap.entrySet()) {
				
			System.out.println(counter + ". " + entry.getKey()); 
			counter++;
			
		}
	
		}	
	}
		
}

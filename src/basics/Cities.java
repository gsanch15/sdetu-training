package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array 
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas" };
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);  //array has 4 elements
		
		//Declare & define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Arizona";
		// This array was defined as having only 5 elements so this extra gives us an error states[5] = "New Mexico";
		
		//Let's do a do-while loop to print on the screen all 5 elements for the array states
		int j = 0;
		
		do {
			
			System.out.println("STATE: " + states[j]);
			
			if(states[j] == "Texas")
			{
				
				System.out.println("State Found!");
				
			}
			
			j = j + 1;

				//Let's put an if inside of the do-while loop to look for the state of Texas and if found to display "State Found"
			
		} while ( j < 5);
		
		//Declare array
		String[] countries;
		
		//Define the array the number 4 means it has only four members from 0 to 3 as the indexes
		countries = new String[5];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		countries[3] = "Mexico";
		countries[4] = "Venezuela";
		// This gives us an error countries[4] = "Spain";
		
		int i;
		for(i = 0; i < 5; i++) {
		System.out.println("COUNTRIES: " + countries[i]);
		}
		
		int k = 0;
		boolean countryFound = false;
		
		//while (!countryFound) {
		//	String country = countries[k];
			
		//	if (country == "Mexico") {
		//		countryFound = true;
		//	}
		//	k++;
		//}
		
	}

}

package basics;

public class Cities {

    public static void main(String[] args) {
        //Declare and define an array
        String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        //Declare array
        String[] countries;

        //Define the array
        countries = new String[3];
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "UK";
        System.out.println(countries[2]);

        //Declare an array and define its size
        String[] states = new String[5];
        states[0] = "California";
        states[1] = "Ohio";
        states[2] = "New Jersey";
        states[3] = "Texas";
        states[4] = "Utah";
        //System.out.println(states[0]);

        //do loop
        System.out.println("----------");
        System.out.println("Do loop");
        int i = 0;

        // Do loop: enter the loop and then test condition
        do {
            System.out.println("State: " + states[i]);
            i += 1;
        } while (i < 5);

        //while loop
        System.out.println("----------");
        System.out.println("While loop");
        int n = 0;
        boolean stateFound = false;
        // While loop: test condition first, then, if true, enter the loop
        while (!stateFound) {
            //System.out.println("STATE at " + n + ": " + states[n]);

            String state = states[n];
            System.out.println(state);
            if (state == "Texas") {
                System.out.println("STATE FOUND!");
                stateFound = true;
            }
            n++;
        }

        //for loop
        System.out.println("----------");
        System.out.println("For loop");
        System.out.println("\nPRINTING WITH FOR LOOP");
        //For loop: best structure for iterating through an array
        for (int x = 0; x <=4; x++) {
            System.out.println(states[x]);
        }




    }
}

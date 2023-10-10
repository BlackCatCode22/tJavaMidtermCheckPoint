import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;




// Main.java
// Driver class for the Zoo program
// dH
// 9/26/23

// updated Oct 5, 2023


public class Main {

    // Creating the genUniqueID method
    private static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;


        if (theSpecies.contains("hyena")) {
            prefix = "Hy";
        }

        return prefix + Integer.valueOf(suffix);

    }


    public static void main(String[] args) {

        System.out.println("\n\n Welcome to my Zoo Program\n\n");

        // Load all species classes with name.
        // Call the static methods to create a lists of names.
        Lion.inputLionNames();
        Tiger.inputTigerNames();
        Bear.inputBearNames();
        Hyena.inputHyenaNames();



        // Open a csv file using the split() method on a string object
        String path = "C:\\Users\\BE218\\javaStuff\\arrivingAnimals.txt";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            int myCounter = 1;
            while ((myFileLine = reader.readLine()) != null) {
                // The input data from arrivingAnimals looks like this:
                // 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia

                // Create a String array named myArrayOfAnimalData
                String[] myArrayOfAnimalData = myFileLine.split(",");

                // Create another String array named
                String[] myArrayOfAgeGenderSpecies = myArrayOfAnimalData[0].split(" ");

                // Output the age, gender and species

                System.out.println("\n age in years: " + myArrayOfAgeGenderSpecies[0]);
                System.out.println("\n text for age (should be 'year') " + myArrayOfAgeGenderSpecies[1]);
                System.out.println("\n text for age (should be 'old') " + myArrayOfAgeGenderSpecies[2]);
                System.out.println("\n gender is " + myArrayOfAgeGenderSpecies[3]);
                System.out.println("\n species is " + myArrayOfAgeGenderSpecies[4]);


                // Code up the birthDate() method

                // Get today's date:
                Calendar calendar = Calendar.getInstance();
                Date today = calendar.getTime();

                // Get today's date
                LocalDate currentDate = LocalDate.now();
                int year = currentDate.getYear();

                // Print the year
                System.out.println("Current Year: " + year);

                int animalsYearOfBirthDate = year - Integer.parseInt(myArrayOfAgeGenderSpecies[0]);

                // Split the next group of words by a space.
                String[] myArrayOfBirthSeason = myArrayOfAnimalData[1].split(" ");

                String birthSeason = myArrayOfBirthSeason[3];
                System.out.println(" \n birthSeason = " + birthSeason + "\n\n");

                String myAnimalBD = " ";

                if (birthSeason.contains("spring")) {
                    myAnimalBD = "Mar 31, " + animalsYearOfBirthDate;

                }

                System.out.println("\n\n Animal birth date is: " + myAnimalBD + "\n\n");






                // Subtract 4 years
                calendar.add(Calendar.YEAR, - Integer.parseInt(myArrayOfAgeGenderSpecies[0]) );

                // Get the new date after subtraction
                Date yearsAgo = calendar.getTime();



                // Print the original and new dates
                System.out.println("Today's Date: " + today);
                System.out.println("Date " + myArrayOfAgeGenderSpecies[1] + " years ago: " + yearsAgo);




                System.out.println("\n Species is " + myArrayOfAgeGenderSpecies[4]);
                System.out.println("\n Animal Number " + myCounter + " ************");
                System.out.println("\n myArrayOfAnimalData[0] is.. " + myArrayOfAnimalData[0]);
                System.out.println("\n myArrayOfAnimalData[1] is.. " + myArrayOfAnimalData[1]);
                System.out.println("\n myArrayOfAnimalData[2] is.. " + myArrayOfAnimalData[2]);
                System.out.println("\n myArrayOfAnimalData[3] is.. " + myArrayOfAnimalData[3]);
                System.out.println("\n myArrayOfAnimalData[4] is.. " + myArrayOfAnimalData[4]);
                System.out.println("\n myArrayOfAnimalData[5] is.. " + myArrayOfAnimalData[5]);
                System.out.println("\n\n");

                // increment the animal counter
                myCounter++;



                /*
                String myStr = myArray[0];
                System.out.println("\n myStr = " + myStr);
                myArray = myStr.split(" ");
                String mySpecies = myArray[4];
                System.out.println(" Species is: " + mySpecies);
                System.out.println("\n myStr = " + myStr);
*/

/*
                System.out.println(" First element: " + myArray[0]);
                System.out.println(" Second element: " + myArray[1]);
                System.out.println(" Third item: " + myArray[2]);
                System.out.println(" Fourth element: " + myArray[3]);
                System.out.println(" Fifth item: " + myArray[4]);
                System.out.println(" Sixth item: " + myArray[5]);
*/

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }




}


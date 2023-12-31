import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Lion extends Animal {
    // Create a static member variable that accumulates the number of hyenas created.
    private static int numOfLions = 0;


    // Create an ArrayList to store the split values read from animalNames.txt
    private static List<String> myListOfLionNames = new ArrayList<>();

    // write a Getter method to look at the static int numOfHyenas
    public static int getNumOfLions() {
        return numOfLions;
    }

    // Create a constructor that will increment numOfHyenas when a new Hyena object is created.
    public Lion() {
        System.out.println("\n A new Lion object was created!!!");
        numOfLions++;
   }

    public Lion(String aniID, String aniName, LocalDate aniBD, String aniColor, String aniGender,
                 String aniWeight, String aniFrom, LocalDate arrivalDate) {
        super(aniID, aniName, aniBD, aniColor, aniGender, aniWeight, aniFrom, arrivalDate);
        numOfLions++;
    }


   // Create a method that input tiger names from a file named: animalNames.txt
   public static void inputLionNames()  {
       // Define the file path
       String filePath = "C:\\2023_fall\\javaPrograms\\animalNames.txt";

       try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            Scanner scanner = new Scanner(System.in)) {
           String line;
           int lineNum = 1;
           while ((line = fileReader.readLine()) != null) {

               if (lineNum == 7) {
                   // Split the line into an array of values using a comma as the delimiter
                   String[] values = line.split(",");
                   // Process the values and add them to the ArrayList
                   for (String value : values) {
                       myListOfLionNames.add(value.trim()); // Trim removes leading/trailing spaces
                   }
               }
               lineNum++;
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    // output the list.
    public static void listOut() {
        for (String name : myListOfLionNames) {
            System.out.println(name);
        }
    }

    // pop one name off the list
    public static String popLionName() {
        // Remove the first element from the ArrayList
        String removedLionName = "";
        if (!myListOfLionNames.isEmpty()) {
            removedLionName = myListOfLionNames.remove(0);
        } else {
            System.out.println("The ArrayList is empty. Nothing to remove.");
        }
        return removedLionName;
    }
}

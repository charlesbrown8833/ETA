/*
Charles Brown
CITC-1311-C01
November 9, 2023
*/
package arrivaltimeapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ArrivalTimeApp {


    public static void main(String[] args) {
        System.out.println("Arrival Time Estimator");
        System.out.println();
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
            DateTimeFormatter tf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
            LocalDate depDate = LocalDate.parse(Console.getString("Departure date (YYYY-MM-DD): "));
            LocalTime depTime = LocalTime.parse(Console.getString("Departure time (HH:MM): "));
            int miles = Console.getInt("Enter miles: ");
            int mph = Console.getInt("Enter miles per hour: ");
            int travelHours = miles / mph;
            int travelMins = miles % mph;
            LocalDateTime arrDate = LocalDateTime.of(depDate, depTime).plusHours(travelHours).plusMinutes(travelMins);
            
            String dateFormatted = df.format(arrDate);
            String timeFormatted = tf.format(arrDate);
 
            System.out.println();
            System.out.println("Estimated travel time");
            System.out.println("Hours: " + travelHours);
            System.out.println("Minutes: " + travelMins);
            System.out.println("Estimated date of arrival: " + dateFormatted);
            System.out.println("Estimated time of arrival: " + timeFormatted);
            System.out.println();
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }
        System.out.println("Bye!");
    }
    
}

import java.util.Arrays;

public class Calendar {

    public static void main(String args[])
    {
        String[][] calendar = {{"volunteer", "delivery", null, null, "doctor", null, "soccer"},
                {null, "exam 1", null, "mechanic", null, null, "soccer"},
                {"volunteer", "off work", null, "birthday", null, "concert", null},
                {null, "exam 2", null, null, "doctor", null, "soccer"},
                {"visit family", null, null, null, null, null, null}};

        int numberOfEventsPerWeek = 0;

        for(int i = 0; i < calendar.length; i++) {
            numberOfEventsPerWeek = 0;
            for(int j = 0; j < calendar[i].length; j++) {
                // We need conditional logic to ensure that we do not count the empty days
                String event = calendar[i][j];
                if(event!=null && !event.equals("")) {
                    // If the day does not have a null value and an empty string for an event, then we print it and count it
                    System.out.println("Week: " + (i+1) + ", Day: " + (j+1) + ", Event: " + event);
                    numberOfEventsPerWeek++;
                }
            }
            System.out.println("Total number of events for week "+ (i+1) +": " + numberOfEventsPerWeek + "\n");
        }


    }
}

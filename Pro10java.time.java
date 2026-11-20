
import java.time.*;

class Employee {
    public static void main(String args[]) {

        String name[] = {
            "Rajesh", "Meena", "Kumar", "Asha", "Vikram",
            "Priya", "Suresh", "Anita", "Ravi", "Deepa"
        };

        LocalDate date[] = {
            LocalDate.of(2012, 5, 10),
            LocalDate.of(2015, 3, 20),
            LocalDate.of(2010, 12, 5),
            LocalDate.of(2018, 7, 25),
            LocalDate.of(2011, 11, 15),
            LocalDate.of(2016, 9, 8),
            LocalDate.of(2009, 4, 2),
            LocalDate.of(2013, 1, 19),
            LocalDate.of(2017, 6, 30),
            LocalDate.of(2014, 10, 5)
        };

        // Sort by date
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {

                if (date[i].isAfter(date[j])) {
                    LocalDate temp = date[i];
                    date[i] = date[j];
                    date[j] = temp;

                    String tempName = name[i];
                    name[i] = name[j];
                    name[j] = tempName;
                }
            }
        }

        System.out.println("Name\t\tDate of Appointment");
        System.out.println("--------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(name[i] + "\t\t" + date[i]);
        }
    }
}

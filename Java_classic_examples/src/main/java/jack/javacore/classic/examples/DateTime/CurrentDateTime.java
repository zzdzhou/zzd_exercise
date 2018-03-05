package jack.javacore.classic.examples.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class CurrentDateTime {

    public static void main(String[] args) {
//        Properties props = System.getProperties();
//        System.out.println(props.toString());
//
//        for (String key : props.stringPropertyNames()) {
//            System.out.println(key + " = " + props.getProperty(key));
//        }
        CurrentDateTime currentDateTime = new CurrentDateTime();
        currentDateTime.dateTimeFormatter();
    }

    private void currentDateTime() {
        LocalDate dNow = LocalDate.now();
        System.out.println(dNow);

        LocalTime dTime = LocalTime.now();
        System.out.println(dTime);

        LocalDateTime dDateTime = LocalDateTime.now();
        System.out.println(dDateTime);
    }

    private void dateTimeFormatter() {
        LocalDateTime now = LocalDateTime.now();
        String fNow = now.format(DateTimeFormatter.ofPattern("dd. LLL yyyy hh:mm a"));
        System.out.println(fNow);
        String fNow1 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(fNow1);
    }
}

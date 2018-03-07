package jack.javacore.classic.examples.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZone {

    public static void main(String[] args) {
        TimeZone timeZone = new TimeZone();
//        timeZone.availableZoneId();
        String dateTimeS = "2018-03-01 00:00:00";
        long dateTime = timeZone.getDateTime(dateTimeS);
        System.out.println(dateTimeS + " instant : " + dateTime);
    }


    public void availableZoneId() {
        for (String item : ZoneId.getAvailableZoneIds()) {
            System.out.println(item);
        }
    }

    public long getDateTime(String dateTimeS) {
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeS, dtFormatter);
//        Instant instant = dateTime.atZone(ZoneId.of("Asia/Shanghai")).toInstant();

        Instant instant1 = dateTime.toInstant(ZoneOffset.ofHours(+8));

        long aLong = instant1.toEpochMilli();
        return aLong;
    }

}

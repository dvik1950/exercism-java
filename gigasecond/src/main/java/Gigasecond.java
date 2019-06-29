import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javafx.util.converter.LocalDateTimeStringConverter;

class Gigasecond {

    private LocalDate birthDate;
    private LocalDateTime birthDateTime;
    
    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
        if (birthDateTime != null){
        return birthDateTime.plusSeconds(1000000000); 
        }
        int sec_in_days = 1000000000 / 3600 / 24;
        birthDate.plusDays(sec_in_days);
        LocalDateTime loc = LocalDateTime.of(birthDate, LocalTime.MIN);
        return loc;
    }

}

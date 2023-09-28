package ru.gmotrich.protocol.entity.type;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DateTime {
    private char hour;
    private char minute;
    private char second;
    private char day;
    private char month;
    private short year;

    @Override
    public String toString() {
        return String.format("""
                        DateTime:
                        Hour: %c
                        Minute: %c
                        Second: %c
                        Day: %c
                        Month: %c
                        Year: %d""",
                hour, minute, second, day, month, year);
    }
}

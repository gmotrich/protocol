package ru.gmotrich.protocol.entity.dataStructures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gmotrich.protocol.entity.type.DateTime;
import ru.gmotrich.protocol.entity.type.Rational;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Slice {
    private short version;
    private DateTime server_time;
    private DateTime unit_time;
    private char longitude_side;
    private Rational longitude;
    private char latitude_side;
    private Rational latitude;
    private Rational speed;
    private Rational course;
    private char mode;
    private long mode_time;
    private short sensors;
    private short sensors_mask;
    private char route;
    private short adc0;
    private short adc1;
    private short adc2;
    private short key_mask;


    @Override
    public String toString() {
        return String.format("""
                        Slice:
                        Version: %d
                        Server Time: %s
                        Unit Time: %s
                        Longitude Side: %c
                        Longitude: %s
                        Latitude Side: %c
                        Latitude: %s
                        Speed: %s
                        Course: %s
                        Mode: %c
                        Mode Time: %d
                        Sensors: %d
                        Sensors Mask: %d
                        Route: %c
                        ADC0: %d
                        ADC1: %d
                        ADC2: %d
                        Key Mask: %d""",
                version,
                server_time.toString(),
                unit_time.toString(),
                longitude_side,
                longitude.toString(),
                latitude_side,
                latitude.toString(),
                speed.toString(),
                course.toString(),
                mode,
                mode_time,
                sensors,
                sensors_mask,
                route,
                adc0,
                adc1,
                adc2,
                key_mask);
    }

}

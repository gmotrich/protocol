package ru.gmotrich.protocol.entity.dataStructures;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gmotrich.protocol.entity.type.DateTime;

@Getter
@Setter
@NoArgsConstructor
public class UnloadingBlackBox {
    DateTime time_from;
    DateTime time_till;

    public UnloadingBlackBox(DateTime time_from, DateTime time_till) {
        if (time_from.getDay() > time_till.getDay() || time_from.getMonth() > time_till.getMonth()) {
            this.time_from = time_from;
            this.time_till = time_till;
        }
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return String.format("""
                UnloadingBlackBox:
                Time from: %s
                Time till: %s""", time_from.toString(), time_till.toString());
    }

}

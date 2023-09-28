package ru.gmotrich.protocol.entity.dataStructures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SettingTheMode implements Serializable {
    private char mode;
    private long time;

    @Override
    public String toString() {
        return String.format("""
                SettingTheMode:
                Mode: %c
                Time: %d""", mode, time);
    }

}

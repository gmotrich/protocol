package ru.gmotrich.protocol.entity.dataStructures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlackBoxSetup {
    private long time;

    @Override
    public String toString() {
        return String.format("""
                BlackBoxSetup:
                Time: %d""", time);
    }
}

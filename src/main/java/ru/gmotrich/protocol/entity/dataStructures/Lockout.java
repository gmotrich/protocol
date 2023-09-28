package ru.gmotrich.protocol.entity.dataStructures;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Lockout {
    private char block;

    public Lockout(char block) {
        if (block == 0x01 || block == 0x00)
            this.block = block;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return String.format("""
                Lockout:
                Block: %c""", block);
    }

}

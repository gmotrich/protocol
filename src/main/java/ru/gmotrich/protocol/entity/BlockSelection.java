package ru.gmotrich.protocol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlockSelection {
    private boolean all;


    @Override
    public String toString() {
        return String.format("""
                BlockSelection:
                All: %s""", all);
    }
}

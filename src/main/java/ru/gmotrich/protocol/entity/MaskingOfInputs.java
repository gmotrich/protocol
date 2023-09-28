package ru.gmotrich.protocol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MaskingOfInputs {
    private long mask;

    @Override
    public String toString() {
        return String.format("""
                MaskingOfInputs:
                Mask: %d""", mask);
    }
}

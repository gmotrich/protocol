package ru.gmotrich.protocol.entity.type;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Rational {
    private long num;
    private long den;

    public Rational(long num, long den) {
        if (den != 0) {
            this.num = num;
            this.den = den;
        }
        else
            throw new IllegalArgumentException();
    }


    public double getRational() {
        return (double) num /den;
   }

    @Override
    public String toString() {
        return String.format("""
                Rational:
                Numerator: %d
                Denominator: %d""", num, den);
    }
}

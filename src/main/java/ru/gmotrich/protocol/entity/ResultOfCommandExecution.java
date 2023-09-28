package ru.gmotrich.protocol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultOfCommandExecution {
    private boolean result;

    @Override
    public String toString() {
        return String.format("""
                ResultOfCommandExecution:
                Result: %s""", result);
    }
}

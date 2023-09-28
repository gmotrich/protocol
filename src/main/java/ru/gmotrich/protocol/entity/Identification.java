package ru.gmotrich.protocol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gmotrich.protocol.entity.enums.NodeType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Identification {
    private NodeType type;
    private long id;

    @Override
    public String toString() {
        return String.format("""
                Identification:
                Type: %s
                Id: %d""", type.toString(), id);
    }
}

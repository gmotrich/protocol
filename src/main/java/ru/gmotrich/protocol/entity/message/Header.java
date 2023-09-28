package ru.gmotrich.protocol.entity.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gmotrich.protocol.entity.enums.MessageType;
import ru.gmotrich.protocol.entity.enums.NodeType;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Header implements Serializable{
    private int id;
    private NodeType source;
    private long timeout;
    private MessageType type;
    private long dataLength;
    private int unitId;

    @Override
    public String toString() {
        return String.format("""
                Header:
                id: %d
                source: %s
                timeout: %d
                type: %s
                data length: %d
                unitId: %d
                """, id, source,
                timeout, type,
                dataLength, unitId);
    }
}

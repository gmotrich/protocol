package ru.gmotrich.protocol.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageType {
    MESSAGE_SLICE(0),
    MESSAGE_ON(1),
    MESSAGE_OFF(2),
    MESSAGE_SET_MODE(3),
    MESSAGE_POSITION(4),
    MESSAGE_BLOCK(5),
    MESSAGE_CHANNEL(6 ),
    MESSAGE_SET_RECORDER(7 ),
    MESSAGE_LOAD_RECORDER(8),
    MESSAGE_SET_MASK(10),
    MESSAGE_UNSET_MASK(11),
    MESSAGE_MAP(12),
    MESSAGE_REBOOT(14),
    MESSAGE_ERROR(17),
    MESSAGE_STATUS(18),
    MESSAGE_IDENTIFY(19),
    MESSAGE_NOTIFY_PRIMARY(20),
    MESSAGE_RESULT(21),
    MESSAGE_SELECT(22),
    MESSAGE_CONNECTED(23),
    MESSAGE_DISCONNECTED(24);

    private final int code;


}

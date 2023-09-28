package ru.gmotrich.protocol.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NodeType {
    POINT_SVISOR(0),
    POINT_GPRS(1),
    POINT_SMS(2),
    POINT_DATA(3),
    POINT_USER(4);

    private final int code;

}

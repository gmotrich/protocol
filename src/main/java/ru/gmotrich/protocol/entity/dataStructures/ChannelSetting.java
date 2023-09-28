package ru.gmotrich.protocol.entity.dataStructures;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChannelSetting {
    private char channel;

    public ChannelSetting(char channel) {
        if (channel != 0x01 && channel != 0x02 && channel != 0x04 && channel != 0x00) {
            throw new IllegalArgumentException("Недопустимое значение канала");
        }
        this.channel = channel;
    }


    public void setChannelSetting(char channel) {
        if (channel != 0x01 && channel != 0x02 && channel != 0x04 && channel != 0x00) {
            throw new IllegalArgumentException("Недопустимое значение канала");
        }
        this.channel = channel;
    }

    @Override
    public String toString() {
        return String.format("""
                ChannelSetting:
                Channel: %c""", channel);
    }


}

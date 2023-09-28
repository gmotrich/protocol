package ru.gmotrich.protocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.gmotrich.protocol.entity.enums.NodeType;
import ru.gmotrich.protocol.entity.message.Header;
import ru.gmotrich.protocol.entity.message.Message;

@SpringBootApplication
public class ProtocolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProtocolApplication.class, args);
    }
}

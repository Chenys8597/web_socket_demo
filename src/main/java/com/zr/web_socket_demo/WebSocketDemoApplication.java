package com.zr.web_socket_demo;

import com.zr.web_socket_demo.commom.Common;
import com.zr.web_socket_demo.socket.WebSocket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebSocketDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketDemoApplication.class, args);

        Common.startConsumer(WebSocket.consumer, WebSocket.webSocketSet, Common.TOPIC, Common.PARTITION);

    }

}

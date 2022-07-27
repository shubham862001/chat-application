package com.involveininnovation.chatsever.controller.model;

import jdk.net.SocketFlow;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    private String senderName,receiverName,message,date;
    private Status status;

}

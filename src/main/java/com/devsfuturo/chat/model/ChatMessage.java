package com.devsfuturo.chat.model;

import com.devsfuturo.chat.enums.MessageType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

}
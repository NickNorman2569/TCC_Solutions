package com.example.apptccnodata.Chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ChatController {
    @GetMapping("/chat")
    public String showChat() {
        return "chat";
    }
    
}

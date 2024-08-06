package com.example.rtc.WebsocketConfig;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebsocketController {
        
    @MessageMapping("/signal/offer")
    @SendTo("/sub/signal/offer")
    public SignalDTO siganlOffer(SignalDTO signalDTO){
        return signalDTO;
    }


    @MessageMapping("/signal/answer")
    @SendTo("/sub/signal/answer")
    public SignalDTO siganlAnswer(SignalDTO signalDTO){
        return signalDTO;
    }


}

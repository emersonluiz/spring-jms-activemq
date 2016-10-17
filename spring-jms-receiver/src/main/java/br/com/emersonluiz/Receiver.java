package br.com.emersonluiz;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Controller;

@Controller
public class Receiver {

    @JmsListener(destination="mailbox")
    public void receiveMessage(String message) {
        System.out.println("Receive <" + message + ">");
    }
}

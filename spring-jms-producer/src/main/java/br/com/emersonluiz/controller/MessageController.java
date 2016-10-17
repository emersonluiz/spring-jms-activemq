package br.com.emersonluiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.emersonluiz.service.MessageService;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping(value="/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageService.sendMessage(message);
        return "Sent"; 
    }

}

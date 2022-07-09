package pl.coderslab.beans;

import lombok.Data;

@Data
public class MessageSender {

   private MessageService messageService;
   private String message;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }

    public void sendMessageFromProperty() {
        messageService.send(message);
    }


}

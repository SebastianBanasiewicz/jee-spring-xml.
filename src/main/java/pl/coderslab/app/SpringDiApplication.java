package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);
        hw.printMessage();

        EmailService es = context.getBean("emailService", EmailService.class);
        es.send();

        MessageSender ms = context.getBean("messageSender", MessageSender.class);
        ms.sendMessage();
        ms.sendMessageFromProperty();


        context.close(); // this is the last line of the application
    }
}

package pl.coderslab.beans;


import lombok.Data;


@Data
public class HelloWorld {

private String message;


    public void printMessage() {
        System.out.println("Your Message : " + message);
    }

}

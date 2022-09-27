/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message_prog.message.cl;

/**
 *
 * @author TRAIN 23
 */
public class Message {
    
    
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    
    @Override
    public String toString() {
        return "Message{" + "text=" + text + '}';
    }
    
    
    
}

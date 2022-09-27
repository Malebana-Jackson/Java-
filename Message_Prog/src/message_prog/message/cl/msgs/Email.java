/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message_prog.message.cl.msgs;

import message_prog.message.cl.Message;

/**
 *
 * @author TRAIN 23
 */
public class Email extends Message{
    
    
    private String sender, receiver, subject;
    
   
    public Email(String text) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Email{" + "sender=" + sender + ", receiver=" + receiver + ", subject=" + subject +  '}' + super.toString();
    }
    
    
    
    
    
}

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
public class SMS extends Message {
    
    
    private String recipientContactNo;
    
    public SMS(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }



    @Override
    public String toString() {
        
        return "SMS{" + "recipientContactNo=" + recipientContactNo + '}' + super.toString();
    }
    
    
    
    
    
}

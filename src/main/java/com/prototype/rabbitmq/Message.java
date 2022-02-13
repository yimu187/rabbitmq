package com.prototype.rabbitmq;

import java.util.Date;

public class Message {
    
    private String messageId;
    private String message;
    private Date messageDate;


    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }


}

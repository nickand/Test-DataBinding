package com.android.testdatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Message extends BaseObservable {
    private String firstMessage;
    private String secondMessage;

    public Message(String firstMessage, String secondMessage) {
        this.firstMessage = firstMessage;
        this.secondMessage = secondMessage;
    }

    @Bindable
    public String getFirstMessage() {
        return this.firstMessage;
    }

    @Bindable
    public String getSecondMessage() {
        return this.secondMessage;
    }

    public void setFirstMessage(String firstMessage) {
        this.firstMessage = firstMessage;
    }

    public void setSecondMessage(String secondMessage) {
        this.secondMessage = secondMessage;
    }
}
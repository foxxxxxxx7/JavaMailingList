package application.model;

import javafx.scene.layout.Priority;

import java.time.LocalDate;

public class Message {
    private String sender;
    private String title;
    private LocalDate dateTime;
    private Priority priority;
    private String recipient;
    private String body;

    public Message(String sender, String title, LocalDate dateTime, Priority priority, String recipient, String body) {
        this.sender = sender;
        this.title = title;
        this.dateTime = dateTime;
        this.priority = priority;
        this.recipient = recipient;
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", title='" + title + '\'' +
                ", dateTime=" + dateTime +
                ", priority=" + priority +
                ", recipient='" + recipient + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}


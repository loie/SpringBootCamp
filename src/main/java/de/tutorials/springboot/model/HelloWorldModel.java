package de.tutorials.springboot.model;

// Einfachster Fall: ein "Bean", d.h. eine Klasse mit diversen Feldern die alle als Setter und Getter verfügbar gemacht werden.
// Alle Felder im JSON heißen genau so wie die Felder in der Klasse.
// Später werden wir ein paar Felder in der Klasse anders benennen als im JSON, einfach weil wir können.
public class HelloWorldModel {
    private String someText;
    private Boolean someBoolean;
    private Integer someNumber;

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    public Boolean getSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(Boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    public Integer getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(Integer someNumber) {
        this.someNumber = someNumber;
    }
}

package de.tutorials.springboot.controller;

import de.tutorials.springboot.model.HelloWorldModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// Spring sucht automatisch alle Klassen mit einer @Controller Annotation.
// Wichtig: man sollte sich deshalb eine Namenskonvention überlegen, damit die richtigen Controller möglichst intuitiv gefunden werden.
// Beispiel: "Pfadname"Controller, wie hier: /helloWorld/* mappt auf HelloWorldController.
@Controller
public class HelloWorldController {
    private static final Log LOGGER = LogFactory.getLog(HelloWorldController.class);

    // Die Methode wird als URL /helloWorld/data für GET-Requests verfügbar gemacht.
    @RequestMapping(value = "/helloWorld/data", method = RequestMethod.GET)
    // @ResponseBody sagt Spring, daß es bitte das Ergebnis unserer Methode serialisieren soll. Standardmäßig passiert das als JSON.
    @ResponseBody
    // Der Name der Methode ist völlig egal. Wichtig ist nur @RequestMapping. Der Methodenname sollte dennoch hilfreich gewählt sein,
    // d.h. eine schreibende Methode sollte nicht unbedingt "get" heißen.
    public HelloWorldModel get() {
        HelloWorldModel model = new HelloWorldModel();
        model.setSomeText("foo");
        model.setSomeBoolean(false);
        model.setSomeNumber(1234);

        // Dank @ResponseBody müssen wir nichts weiter machen. Das Ergebnis wird ein JSON.
        return model;
    }

    // Analog zur get() Methode mappen wir eine weitere Methode auf dieselbe URL, aber für POST-Requests.
    @RequestMapping(value = "/helloWorld/data", method = RequestMethod.POST)
    @ResponseBody
    // Durch @RequestBody versucht Spring den gesamten Body des Requests in die Klasse zu "packen". Das JSON muss folglich so aussehen
    // wie die Java-Klasse (HelloWorldModel). Man kann das auch anders machen, aber das machen wir erst später.
    public HelloWorldModel store(@RequestBody HelloWorldModel model) {
        // Einfach loggen und wieder zurückgeben. Hier schreiben wir später etwas in eine Datenbank.
        LOGGER.info("Received model:\n" +
                "someText: " + model.getSomeText() + "\n" +
                "someBoolean: " + model.getSomeBoolean() + "\n" +
                "someNumber: " + model.getSomeNumber()
        );

        return model;
    }
}

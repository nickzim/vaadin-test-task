package ru.nickzim.task.View;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import ru.nickzim.task.Model.Person;
import ru.nickzim.task.Services.PersonsService;

@Route("add")
public class AddPersonView extends VerticalLayout {

    @Autowired
    private PersonsService service;

    public AddPersonView(){

        VerticalLayout form = new VerticalLayout();

        TextField firstnameField = new TextField("First name");
        TextField lastnameField = new TextField("Last name");
        TextField countryField = new TextField("Country");
        IntegerField ageField = new IntegerField("Age");

        HorizontalLayout buttons = new HorizontalLayout();
        Button add = new Button("Add", e -> {
            if (firstnameField.isEmpty() || lastnameField.isEmpty() || countryField.isEmpty() || ageField.isEmpty()){
                Notification.show("Enter the complete data");
            } else {
                service.create(new Person(firstnameField.getValue(),
                        lastnameField.getValue(),
                        countryField.getValue(),
                        ageField.getValue()));
                UI.getCurrent().navigate("");
            }
        });
        Button cancel = new Button("Cancel", e ->{
            UI.getCurrent().navigate("");
        });
        buttons.add(add,cancel);
        form.add(firstnameField,lastnameField,countryField,ageField,buttons);

        form.setSizeFull();
        form.setAlignSelf(Alignment.CENTER);
        add(form);
    }
}

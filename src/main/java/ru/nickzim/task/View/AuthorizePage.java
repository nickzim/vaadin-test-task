package ru.nickzim.task.View;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import ru.nickzim.task.Services.UsersService;

@Route("")
public class AuthorizePage extends VerticalLayout {

    @Autowired
    private UsersService service;

    public AuthorizePage(){

        VerticalLayout data = new VerticalLayout();

        Label message = new Label();
        TextField loginField = new TextField("Username");
        PasswordField passField = new PasswordField("Password");
        Button loginButton = new Button("LOG IN", e -> {
            if (service.getUser(loginField.getValue()) != null && service.getUser(loginField.getValue()).getPassword().equals(passField.getValue())) {
                getUI().get().getPage().setLocation("http://localhost:8080/main");
            } else {
                data.remove(message);
                message.setText("Incorrect data");
                data.add(message);
            }
        });

        data.add(loginField, passField, loginButton);

        data.setSizeFull();
        data.setAlignItems(Alignment.CENTER);
        add(data);
    }

}

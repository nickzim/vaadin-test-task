package ru.nickzim.task.View;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.nickzim.task.Model.Person;
import ru.nickzim.task.Services.PersonsService;


@Route("")
public class MainView extends VerticalLayout {

    private PersonsService service;

    public MainView(PersonsService service){

        this.service = service;

        VerticalLayout layout = new VerticalLayout();

        Grid<Person> grid = new Grid<>(Person.class);

        Anchor logout = new Anchor("logout", "Log out");

        grid.setItems(service.getAll());

        Button addButton = new Button("Add", e ->{
            UI.getCurrent().navigate("add");
        });

        layout.add(logout,grid,addButton);

        layout.setSizeFull();
        layout.setAlignSelf(Alignment.CENTER);
        add(layout);
    }
}

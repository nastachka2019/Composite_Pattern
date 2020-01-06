package by.epam.shpakova.entity;

import java.util.List;

public interface Component {

    void add(Component component);

    ComponentType getComponentType();

    String allComponents() throws IllegalStateException;

    List<Component> getComponents();

    void setComponents(List<Component> components);

}

package com.dom.parsing.model3;

import java.util.List;

public class Root {

    private String name;
    private List<People> people;

    public Root(String name, List<People> people) {
        this.name = name;
        this.people = people;
    }

    public Root() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}

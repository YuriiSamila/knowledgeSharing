package main.patterns.behavioral.visitor.projectelements;

import main.patterns.behavioral.visitor.developers.Developer;

public class DataBase implements ProjectElement {

    @Override
    public void writtenBy(Developer developer) {
        developer.create(this);
    }

}

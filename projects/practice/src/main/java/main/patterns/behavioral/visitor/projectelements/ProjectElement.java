package main.patterns.behavioral.visitor.projectelements;

import main.patterns.behavioral.visitor.developers.Developer;

public interface ProjectElement {

    void writtenBy(Developer developer);

}

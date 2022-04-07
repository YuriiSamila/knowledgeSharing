package main.patterns.behavioral.visitor.developers;

import main.patterns.behavioral.visitor.projectelements.DataBase;
import main.patterns.behavioral.visitor.projectelements.ProjectClass;
import main.patterns.behavioral.visitor.projectelements.Test;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing class without 'clean code' principles");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Brakes database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing not reliable tests");
    }
}

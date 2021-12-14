package main.patterns.behavioral.visitor.developers;

import main.patterns.behavioral.visitor.projectelements.DataBase;
import main.patterns.behavioral.visitor.projectelements.ProjectClass;
import main.patterns.behavioral.visitor.projectelements.Test;

public interface Developer {

    void create(ProjectClass projectClass);
    void create(DataBase dataBase);
    void create(Test test);

}

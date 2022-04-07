package main.patterns.behavioral.visitor.projectelements;

import main.patterns.behavioral.visitor.developers.Developer;

public class Project implements ProjectElement {

    private ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[] {
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void writtenBy(Developer developer) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.writtenBy(developer);
        }
    }
}

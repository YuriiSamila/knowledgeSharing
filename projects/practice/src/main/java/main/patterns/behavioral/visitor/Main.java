package main.patterns.behavioral.visitor;

import main.patterns.behavioral.visitor.developers.Developer;
import main.patterns.behavioral.visitor.developers.JuniorDeveloper;
import main.patterns.behavioral.visitor.developers.SeniorDeveloper;
import main.patterns.behavioral.visitor.projectelements.Project;

public class Main {

    public static void main(String[] args) {

        Project project = new Project();
        Developer juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();
        System.out.println("Junior is working...");
        project.writtenBy(juniorDeveloper);
        System.out.println("------------------------------------------------");
        System.out.println("Senior is working...");
        project.writtenBy(seniorDeveloper);

    }

}

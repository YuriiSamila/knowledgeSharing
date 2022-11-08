package main.patterns.behavioral.observer;

import java.util.List;

@FunctionalInterface
public interface Observer {

    void handleEvent(List<String> goods);

}

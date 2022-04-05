package main.jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("testingFootball:type=basic,name=game");
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            server.registerMBean(new FootballGame(), objectName);
        } catch (MalformedObjectNameException | InstanceAlreadyExistsException | MBeanRegistrationException |
                NotCompliantMBeanException e) {
            e.printStackTrace();
        }
        while (true) {
        }
    }

}

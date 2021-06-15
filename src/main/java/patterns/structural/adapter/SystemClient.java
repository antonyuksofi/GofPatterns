package patterns.structural.adapter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemClient {
    private Integer clientInputFirst = 1;
    private Integer clientInputSecond = 2;

    private static final Logger logger = LoggerFactory.getLogger(SystemClient.class);

    public static void main(String[] args) {
        SystemClient client = new SystemClient();
        NewSystemInterface system;

        // working with new system
        system = new NewSystem();
        client.operateWithSystem(system);

        // working with old system via the same interface
        system = new OldSystemAdapter(new OldSystem());
        client.operateWithSystem(system);
    }

    public void operateWithSystem(NewSystemInterface newSystemInterface) {
        logger.info("Operating with " + newSystemInterface.getClass().getSimpleName());
        newSystemInterface.doSuperPuperNewLogic(clientInputFirst, clientInputSecond);
    }
}

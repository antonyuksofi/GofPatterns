package patterns.structural.adapter;

import java.time.LocalDateTime;

public class OldSystemAdapter implements NewSystemInterface {
    OldSystem oldSystem;
    String stubStr;

    OldSystemAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
        stubStr = LocalDateTime.now().toString();
    }

    @Override
    public boolean doSuperPuperNewLogic(Integer first, Integer second) {
        // attention: transformation to the old interface
        return oldSystem.doJustRegularLogic(second, first, stubStr);
    }
}

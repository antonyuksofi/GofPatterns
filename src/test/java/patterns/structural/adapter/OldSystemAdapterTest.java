package patterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OldSystemAdapterTest {
    Integer biggerInt = 2;
    Integer smallerInt = 1;

    @Test
    public void testOldSystemAdapterFunctionality() {
        // given
        NewSystemInterface newSystem = new NewSystem();

        OldSystem oldSystem = new OldSystem();
        NewSystemInterface oldSystemAdapter = new OldSystemAdapter(oldSystem);

        // when
        boolean resultFromNewSystem = newSystem.doSuperPuperNewLogic(biggerInt, smallerInt);
        boolean resultFromOldSystem = oldSystemAdapter.doSuperPuperNewLogic(biggerInt, smallerInt);

        // then
        assertEquals(resultFromNewSystem, resultFromOldSystem);
    }
}

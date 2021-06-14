package patterns.structural.adapter;

public class NewSystem implements NewSystemInterface {
    @Override
    public boolean doSuperPuperNewLogic(Integer a, Integer b) {
        return a > b;
    }
}

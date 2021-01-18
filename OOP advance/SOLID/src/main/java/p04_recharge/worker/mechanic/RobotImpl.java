package p04_recharge.worker.mechanic;

import p04_recharge.worker.functions_interface.Robot;
import p04_recharge.worker.BaseWorker;

public class RobotImpl extends BaseWorker implements Robot {

    private int capacity;
    private int currentPower;

    public RobotImpl(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getCurrentPower() {
        return currentPower;
    }

    @Override
    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    @Override
    public void work(int hours) {
        if (hours > this.currentPower) {
            hours = currentPower;
        }

        super.work(hours);
        this.currentPower -= hours;
    }
}

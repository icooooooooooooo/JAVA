package p04_recharge.worker.mechanic;

import p04_recharge.worker.worker_necesities.Rechargable;

public class AdapterRobot extends RobotImpl implements Rechargable {

    public AdapterRobot(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void recharge() {
        super.setCurrentPower(super.getCapacity());
    }
}

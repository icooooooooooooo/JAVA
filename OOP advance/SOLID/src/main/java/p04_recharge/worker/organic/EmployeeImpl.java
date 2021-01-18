package p04_recharge.worker.organic;

import p04_recharge.worker.functions_interface.Sleeper;
import p04_recharge.worker.BaseWorker;

public class EmployeeImpl extends BaseWorker implements Sleeper {

    public EmployeeImpl(String id) {
        super(id);
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

}

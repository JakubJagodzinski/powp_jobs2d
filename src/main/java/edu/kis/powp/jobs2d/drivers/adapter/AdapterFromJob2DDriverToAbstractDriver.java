package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AdapterFromJob2DDriverToAbstractDriver extends AbstractDriver {

    private final Job2dDriver job2dDriver;

    public AdapterFromJob2DDriverToAbstractDriver(Job2dDriver job2dDriver) {
        super(0, 0);
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void operateTo(int x, int y) {
        this.job2dDriver.setPosition(getX(), getY());
        this.job2dDriver.operateTo(x, y);
        this.job2dDriver.setPosition(x, y);
    }

}

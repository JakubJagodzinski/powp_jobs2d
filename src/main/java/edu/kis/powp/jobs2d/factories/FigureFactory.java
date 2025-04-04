package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.command.ComplexCommand;

public class FigureFactory {

    protected int startX;
    protected int startY;

    public FigureFactory(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public ComplexCommand createScript(int width, int height) {
        return null;
    }

}

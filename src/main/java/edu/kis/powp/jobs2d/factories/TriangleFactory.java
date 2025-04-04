package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class TriangleFactory extends FigureFactory {

    public TriangleFactory(int startX, int startY) {
        super(startX, startY);
    }

    @Override
    public ComplexCommand createScript(int width, int height) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(this.startX, this.startY));
        command.addCommand(new OperateToCommand(this.startX, this.startY - height));
        command.addCommand(new OperateToCommand(this.startX + width, this.startY));
        command.addCommand(new OperateToCommand(this.startX, this.startY));

        return command;
    }

}

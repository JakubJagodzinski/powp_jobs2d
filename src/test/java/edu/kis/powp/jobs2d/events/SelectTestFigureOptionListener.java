package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AdapterFromJob2DDriverToAbstractDriver;
import edu.kis.powp.jobs2d.factories.FigureFactory;
import edu.kis.powp.jobs2d.factories.RectangleFactory;
import edu.kis.powp.jobs2d.factories.TriangleFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	private enum Figure {
		FIGURE_JOE_1("Figure Joe 1"),
		FIGURE_JOE_2("Figure Joe 2"),
		FIGURE_JANE_1("Figure Jane 1"),
		FIGURE_RECTANGLE_1("Figure Rectangle 1"),
		FIGURE_TRIANGLE_1("Figure Triangle 1");

		private final String figureName;

		Figure(String figureName) {
			this.figureName = figureName;
		}

	}

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(Objects.equals(e.getActionCommand(), Figure.FIGURE_JOE_1.figureName)) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if(Objects.equals(e.getActionCommand(), Figure.FIGURE_JOE_2.figureName)) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if(Objects.equals(e.getActionCommand(), Figure.FIGURE_JANE_1.figureName)) {
			FiguresJane.figureScript(new AdapterFromJob2DDriverToAbstractDriver(driverManager.getCurrentDriver()));
		} else if(Objects.equals(e.getActionCommand(), Figure.FIGURE_RECTANGLE_1.figureName)) {
			RectangleFactory rectangleFactory = new RectangleFactory(0, 0);
			rectangleFactory.createScript(200, 200).execute(driverManager.getCurrentDriver());
		} else if(Objects.equals(e.getActionCommand(), Figure.FIGURE_TRIANGLE_1.figureName)) {
			TriangleFactory triangleFactory = new TriangleFactory(0, 0);
			triangleFactory.createScript(200, 200).execute(driverManager.getCurrentDriver());
		}
	}
}

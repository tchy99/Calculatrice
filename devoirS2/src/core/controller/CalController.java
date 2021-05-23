package core.controller;

import core.model.CalModel;
import core.view.CalView;


public class CalController  {
	CalModel model;
	CalView view;

	public CalController(CalModel model, CalView view) {
		this.model = model;
		this.view = view;
	}

	public void handleUserInput(String s1, String operande, String s2) {
		int val1 = Integer.parseInt((java.lang.String) s1);
		int val2 = Integer.parseInt((java.lang.String) s2);
		@SuppressWarnings("unused")
		int result = this.model.calculate(val1, (java.lang.String) operande, val2);
		
	}

	public void start() {
		this.view.show();
	}

}

package com.techlab.man;

public class Boy implements IManable, IEmotional {

	@Override
	public void cry() {
		System.out.println("boy is crying");
	}

	@Override
	public void laugh() {
		System.out.println("boys is laughing");
	}

	@Override
	public void wish() {
		System.out.println("boy wish");

	}

	@Override
	public void departh() {
		System.out.println("boy departh");

	}

}

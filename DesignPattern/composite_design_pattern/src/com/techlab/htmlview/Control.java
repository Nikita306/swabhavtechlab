package com.techlab.htmlview;

public class Control implements IHtmlElement {
	private String input;
	private String text;

	public Control(String input, String text) {
		this.input = input;
		this.text = text;
	}

	public String getInput() {
		return input;
	}

	public String getText() {
		return text;
	}

	@Override
	public String getHtml() {
		return String.format("<" + this.getInput() + ">"
				+ this.getText() + "</" + this.getInput()+">");
	}
}

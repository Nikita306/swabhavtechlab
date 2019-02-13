package com.techlab.htmlview;

import java.util.ArrayList;

public class ControlGroup implements IHtmlElement {
	private String tagName;
	private String content;
	ArrayList<IHtmlElement> list = new ArrayList<IHtmlElement>();

	public ControlGroup(String tagName) {
		this.tagName = tagName;
	}

	public ControlGroup(String tagName, String content) {
		this.tagName=tagName;
		this.content=content;
	}

	public void addElement(IHtmlElement element) {
		list.add(element);

	}

	@Override
	public String getHtml() {
		StringBuilder builder = new StringBuilder();
		builder.append("<"+this.tagName+">\n");
		//builder.append("<"+this.content+">");
		for(IHtmlElement e:list){
			builder.append(e.getHtml()+"\n");
		}
		builder.append("</"+this.tagName+">");
		return builder.toString();
	}

}

package com.javaex.ex03;

public class Shape {
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {
		this.fillColor = "지정안됨";
		this.lineColor = "지정안됨";
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}


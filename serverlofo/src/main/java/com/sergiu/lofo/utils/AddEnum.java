package com.sergiu.lofo.utils;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AddEnum {

	LOST(0, "LOST"), FOUND(1, "FOUND");

	private AddEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	private int code;
	private String message;

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public static String getMessge(int code) {
		if (code == 0)
			return LOST.getMessage();
		return FOUND.getMessage();
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

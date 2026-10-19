package com.isrdc.exceptions;

import java.time.LocalDateTime;

public class ExceptionInfo {
	
	private String exceptionCode;
	private String exceptionMessage;
	private LocalDateTime exceptionDateTime;
	
	
	public ExceptionInfo() {
		super();
	}
	public ExceptionInfo(String exceptionCode, String exceptionMessage, LocalDateTime exceptionDateTime) {
		super();
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionMessage;
		this.exceptionDateTime = exceptionDateTime;
	}
	public String getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public String getExceptionMessage() {
		return exceptionMessage;
	}
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	public LocalDateTime getExceptionDateTime() {
		return exceptionDateTime;
	}
	public void setExceptionDateTime(LocalDateTime exceptionDateTime) {
		this.exceptionDateTime = exceptionDateTime;
	}
	@Override
	public String toString() {
		return "ExceptionInfo [exceptionCode=" + exceptionCode + ", exceptionMessage=" + exceptionMessage
				+ ", exceptionDateTime=" + exceptionDateTime + "]";
	}
}

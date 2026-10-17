package com.isrdc.exceptions;

import java.time.LocalDateTime;

public class ExceptionInfo {
	private String exceptionCode;
	private String exceptionMsg;
	private LocalDateTime exceptionDT;
	
	
	public ExceptionInfo() {
		super();
	}
	public ExceptionInfo(String exceptionCode, String exceptionMsg, LocalDateTime exceptionDT) {
		super();
		this.exceptionCode = exceptionCode;
		this.exceptionMsg = exceptionMsg;
		this.exceptionDT = exceptionDT;
	}
	public String getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	public LocalDateTime getExceptionDT() {
		return exceptionDT;
	}
	public void setExceptionDT(LocalDateTime exceptionDT) {
		this.exceptionDT = exceptionDT;
	}
	@Override
	public String toString() {
		return "ExceptionInfo [exceptionCode=" + exceptionCode + ", exceptionMsg=" + exceptionMsg + ", exceptionDT="
				+ exceptionDT + "]";
	}
}

package com.xiaohei.entity;

public class SendEmailMessageRequest {
	private String name;
	private String email;
	private String message;
	private String sendEmail;
	
	public String getSendEmail() {
		return sendEmail;
	}
	public void setSendEmail(String sendEmail) {
		this.sendEmail = sendEmail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

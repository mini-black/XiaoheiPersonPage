package com.xiaohei.service;

import com.xiaohei.entity.SendEmailMessageRequest;
import com.xiaohei.entity.SendEmailMessageResponse;


public interface SendEmailMessageService {
	public SendEmailMessageResponse sendEmailMessage(SendEmailMessageRequest request);
	
	public SendEmailMessageRequest transMessage(SendEmailMessageRequest request);
	
	public SendEmailMessageRequest transMessageToVisitor(SendEmailMessageRequest request);
}

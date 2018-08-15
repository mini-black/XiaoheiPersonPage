package com.xiaohei.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.entity.SendEmailMessageRequest;
import com.xiaohei.service.SendEmailMessageService;

@Controller
public class EmailSendContactMeContrller {
	
	@Autowired
	SendEmailMessageService sendEmailMessageService;
	
	@RequestMapping("sendEmail")
	public String sendEmailtoVisitor(@RequestParam("name") String name,
			@RequestParam("contact") String contact,
			@RequestParam("message") String message){
		SendEmailMessageRequest request = new SendEmailMessageRequest();
		request.setName(name);
		request.setEmail(contact);
		request.setMessage(message);
		request.setSendEmail("1131044636@qq.com");
		request = sendEmailMessageService.transMessage(request);
		sendEmailMessageService.sendEmailMessage(request);
		if(contact.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")){
			request.setSendEmail(request.getEmail());
			request = sendEmailMessageService.transMessageToVisitor(request);
			sendEmailMessageService.sendEmailMessage(request);
		}
		return "redirect:index.jsp";
	}
}

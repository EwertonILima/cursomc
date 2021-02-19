package com.ewertonilima.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ewertonilima.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}

package org.eventrails.demo.api.command;

import org.eventrails.modeling.messaging.payload.ServiceCommand;

public class NotificationSendSilentCommand extends ServiceCommand {
	private String body;

	public NotificationSendSilentCommand(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String getLockId() {
		return null;
	}
}

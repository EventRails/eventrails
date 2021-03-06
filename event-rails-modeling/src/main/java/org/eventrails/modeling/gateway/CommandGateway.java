package org.eventrails.modeling.gateway;

import org.eventrails.modeling.messaging.payload.Command;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public interface CommandGateway {
	public <R> void send(Command command,
						 Function<? super Command, R> callback);

	public <R> CompletableFuture<R> send(Command command);

	public <R> R sendAndWait(Command command);
	public <R> R sendAndWait(Command command, long timeout, TimeUnit unit);
}

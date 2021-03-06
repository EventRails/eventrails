package org.eventrails.parser.model.component;

import org.eventrails.parser.model.handler.AggregateCommandHandler;
import org.eventrails.parser.model.handler.EventSourcingHandler;

import java.util.List;

public class Aggregate extends Component{
	private List<AggregateCommandHandler> aggregateCommandHandlers;
	private List<EventSourcingHandler> eventSourcingHandlers;

	public void setAggregateCommandHandlers(List<AggregateCommandHandler> aggregateCommandHandlers) {
		this.aggregateCommandHandlers = aggregateCommandHandlers;
	}

	public List<AggregateCommandHandler> getAggregateCommandHandlers() {
		return aggregateCommandHandlers;
	}

	public void setEventSourcingHandlers(List<EventSourcingHandler> eventSourcingHandlers) {
		this.eventSourcingHandlers = eventSourcingHandlers;
	}

	public List<EventSourcingHandler> getEventSourcingHandlers() {
		return eventSourcingHandlers;
	}
}

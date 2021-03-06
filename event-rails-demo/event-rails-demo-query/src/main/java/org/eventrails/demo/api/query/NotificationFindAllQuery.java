package org.eventrails.demo.api.query;

import org.eventrails.modeling.messaging.payload.Query;

public class NotificationFindAllQuery extends Query {
	private int limit;
	private int offset;

	public NotificationFindAllQuery(int limit, int offset) {
		this.limit = limit;
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
}

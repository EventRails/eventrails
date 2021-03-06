package org.eventrails.demo.query;

import org.eventrails.demo.api.query.NotificationFindAllQuery;
import org.eventrails.demo.api.query.NotificationFindByIdQuery;
import org.eventrails.demo.api.view.NotificationView;
import org.eventrails.modeling.annotations.component.Projection;
import org.eventrails.modeling.annotations.handler.QueryHandler;

import java.util.List;

@Projection
public class NotificationProjection {

	@QueryHandler
	NotificationView query(NotificationFindByIdQuery query){
		return new NotificationView(null, null);
	}

	@QueryHandler
	List<NotificationView> query(NotificationFindAllQuery query){
		return List.of(new NotificationView(null, null));
	}
}

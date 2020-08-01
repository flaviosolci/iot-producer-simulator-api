package br.com.iot.producer.simulator.api.controller.events.request;

import br.com.iot.producer.simulator.api.controller.model.EventType;

public class EventsRequest {

    private final int total;
    private List<EventType> events;
}

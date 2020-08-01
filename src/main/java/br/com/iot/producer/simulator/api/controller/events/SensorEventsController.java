package br.com.iot.producer.simulator.api.controller.events;

import br.com.iot.producer.simulator.api.controller.events.request.EventsRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/sensor/events")
public class SensorEventsController {

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Void> produceEvents(@Valid @RequestBody EventsRequest request) {
        return Mono.empty();
    }
}

package controller;
import dto.EventRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.EventService;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/events")
public class EventController {

        @Autowired
        private  EventService eventService;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public void createEvent(@RequestBody EventRequestDto eventRequestDto){
            eventService.createEvent(eventRequestDto);
        }

}

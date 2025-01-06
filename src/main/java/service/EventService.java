package service;

import dto.EventRequestDto;
import dto.EventResponseDto;

public interface EventService {
    void createEvent(EventRequestDto eventRequestDto);
}

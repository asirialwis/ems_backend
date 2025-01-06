package service;


import dto.EventRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import repository.EventRepository;


@Service
@RequiredArgsConstructor
@Slf4j
public class EventServiceImple implements EventService{
    private final EventRepository eventRepository;


    @Override
    public void createEvent(EventRequestDto eventRequestDto) {

        net.javaguides.ems_backend.entity.AppEvent appEvent = net.javaguides.ems_backend.entity.AppEvent.builder()
                .name(eventRequestDto.getName())
                .description(eventRequestDto.getDescription())
                .date(eventRequestDto.getDate())
                .location(eventRequestDto.getLocation())
                .capacity(eventRequestDto.getCapacity())
                .remainingCapacity(eventRequestDto.getRemainingCapacity())
                .tags(eventRequestDto.getTags())
                .build();

        eventRepository.save(appEvent);
    }
}

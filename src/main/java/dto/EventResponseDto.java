package dto;


import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventResponseDto {
    private Long id;
    private String name;
    private String description;
    private LocalDate date;
    private String location;
    private Integer capacity;
    private Integer remainingCapacity;
    private Set<String> tags;

}

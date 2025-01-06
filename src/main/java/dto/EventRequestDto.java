package dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRequestDto {
    @NotBlank(message="Event name is required")
    private String name;

    @NotBlank(message = "Event description is required")
    @Size(max=500, message = "Event description must not exceed 500 characters")
    private String description;

    @NotNull(message= "Event date is required")
    @Future(message = "Event date must be in the future")
    private LocalDate date;

    @NotBlank(message="Event location is required")
    @Size(max=200, message="Event location must not be exceed 200 characters")
    private String location;

    @NotNull(message="Event capacity is required")
    @Min(value = 1,message="Event capacity must be at least 1")
    private Integer capacity;

    @NotNull(message="Event capacity is required")
    private Integer remainingCapacity;

    private Set<String> tags;




}

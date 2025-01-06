package repository;


import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<net.javaguides.ems_backend.entity.AppEvent, Long> {
}

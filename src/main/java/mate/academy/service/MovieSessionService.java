package mate.academy.service;

import java.time.LocalDate;
import java.util.List;
import mate.academy.model.MovieSession;

public interface MovieSessionService extends GenericService<MovieSession> {
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);
}
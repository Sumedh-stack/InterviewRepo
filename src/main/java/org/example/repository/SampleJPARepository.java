package org.example.repository;

import io.lettuce.core.dynamic.annotation.Param;
import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
public interface SampleJPARepository extends JpaRepository<ShowSeat,Long> {



    @Query("Select for update")
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<ShowSeat> findAllByShowId(long showId);

    List<ShowSeat> findAllByShowIdAndSeatIdIn(long showId, List<Long> seatIds);

    @Modifying // whenever we have to update in db use modyfing annotation
    @Query("UPDATE ShowSeat s SET s.ticket= :ticket, s.status = 1 where s.id IN :ids")
    int bookShowSeatsBulk(@Param("ids") List<Long> ids, @Param("ticket") Ticket ticket);
}

*/



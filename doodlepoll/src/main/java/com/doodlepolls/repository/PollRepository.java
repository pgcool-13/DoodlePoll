package com.doodlepolls.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.doodlepolls.model.Poll;

public interface PollRepository extends JpaRepository<Poll, Long> {

	List<Poll> findByTitle(String title);

	List<Poll> findByInitiatedAfter(Date date);

	@Query(value = "select * from Poll p where p.initiator ->> 'email' = ?1", nativeQuery = true)
	List<Poll> getPollsByCreator(String creatorEmail);
}

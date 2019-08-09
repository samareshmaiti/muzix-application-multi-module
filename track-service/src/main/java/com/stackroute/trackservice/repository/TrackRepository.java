package com.stackroute.trackservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.trackservice.domain.Track;

import java.util.List;

////Interface TrackRepository extending JpaRepository to map a function with database
//public interface TrackRepository extends JpaRepository<Track,Integer>{

    public interface TrackRepository extends MongoRepository <Track, Integer> {
//       @Query("select  name from Track track where track.name LIKE ?1")
    List<Track> getTrackByName(String name);
    }

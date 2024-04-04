package com.keithwedinger.springreactive.repositories;

import com.keithwedinger.springreactive.entities.Profile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProfileRepository extends ReactiveMongoRepository<Profile, String> {
}

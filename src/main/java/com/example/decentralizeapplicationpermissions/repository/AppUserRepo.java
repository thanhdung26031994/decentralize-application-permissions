package com.example.decentralizeapplicationpermissions.repository;

import com.example.decentralizeapplicationpermissions.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends CrudRepository<AppUser, Long> {
    AppUser findByName(String username);
}

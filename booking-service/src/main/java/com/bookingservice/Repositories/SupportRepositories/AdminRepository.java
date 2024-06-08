package com.bookingservice.Repositories.SupportRepositories;

import com.bookingservice.Models.SupportModels.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdminRepository extends JpaRepository<Admin, UUID> {

}

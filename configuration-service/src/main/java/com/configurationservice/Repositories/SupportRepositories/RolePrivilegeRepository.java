package com.configurationservice.Repositories.SupportRepositories;


import com.configurationservice.Models.SupportModels.RolePrivilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RolePrivilegeRepository extends JpaRepository<RolePrivilege, UUID> {

}

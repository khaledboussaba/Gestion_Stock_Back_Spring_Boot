package com.project.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stock.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

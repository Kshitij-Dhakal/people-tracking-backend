package com.sanjit.peopletracking.repository;

import com.sanjit.peopletracking.security.User;
import com.sanjit.peopletracking.security.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findByUser(User user);
}

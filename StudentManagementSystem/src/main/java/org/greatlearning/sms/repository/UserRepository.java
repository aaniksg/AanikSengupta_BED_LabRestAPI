package org.greatlearning.sms.repository;

import org.greatlearning.sms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User getUserByUsername(String username);
}

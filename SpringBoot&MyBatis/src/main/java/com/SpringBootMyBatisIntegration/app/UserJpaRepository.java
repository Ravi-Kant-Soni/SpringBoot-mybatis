package com.SpringBootMyBatisIntegration.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserJpaRepository extends JpaRepository<UsersDTO, Long> {

	UsersDTO findById(Long id);

	UsersDTO findByName(String name);
}

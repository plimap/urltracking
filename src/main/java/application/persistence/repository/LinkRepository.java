package application.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.persistence.entity.LinkEntity;

public interface LinkRepository extends JpaRepository<LinkEntity, Long> {


}

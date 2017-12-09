package com.theapprenticewizard.cats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CatRepository extends JpaRepository<Cat, Long> {
}

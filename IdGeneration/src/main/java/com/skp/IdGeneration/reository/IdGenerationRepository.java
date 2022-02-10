
package com.skp.IdGeneration.reository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skp.IdGeneration.model.GeneratedID;

@Repository
public interface IdGenerationRepository extends JpaRepository<GeneratedID, Long> {

}

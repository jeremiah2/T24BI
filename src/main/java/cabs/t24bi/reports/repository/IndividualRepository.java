package cabs.t24bi.reports.repository;

import cabs.t24bi.reports.model.INDIVIDUAL_REC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualRepository extends JpaRepository<INDIVIDUAL_REC, Integer> {

}

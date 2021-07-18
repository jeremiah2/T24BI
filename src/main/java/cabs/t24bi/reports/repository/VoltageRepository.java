package cabs.t24bi.reports.repository;

import cabs.t24bi.reports.model.Voltage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoltageRepository extends JpaRepository<Voltage, Integer> {
}

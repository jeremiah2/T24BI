package cabs.t24bi.reports.repository;

import cabs.t24bi.reports.model.ACCOUNT;
import cabs.t24bi.reports.model.INDIVIDUAL_REC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<ACCOUNT, Long> {


}

package cabs.t24bi.reports.service;

import cabs.t24bi.reports.model.INDIVIDUAL_REC;
import java.util.List;

public interface IndividualService {

//    Individual addUser(Individual user);
    INDIVIDUAL_REC getUserById(int userId);
   // void updateUser(Individual user);
    List<INDIVIDUAL_REC> getAllUsers();
}

package cabs.t24bi.reports.service;

import cabs.t24bi.reports.model.INDIVIDUAL_REC;
import cabs.t24bi.reports.repository.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividualServiceImpl implements IndividualService {

    @Autowired
    private IndividualRepository individualRepository;

    @Override
    public INDIVIDUAL_REC getUserById(int userId) {
        return individualRepository.findById(userId).get();
    }

    @Override
    public List<INDIVIDUAL_REC> getAllUsers() {
        return individualRepository.findAll();
    }
}

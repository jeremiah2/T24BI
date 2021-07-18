package cabs.t24bi.reports.controller;

import cabs.t24bi.reports.model.Individual;
import cabs.t24bi.reports.repository.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndividualController {

    @Autowired
    private IndividualRepository individualRepository;

    @GetMapping("/list")
    public Iterable<Individual> getIndividual() {
        return individualRepository.findAll();
    }

}

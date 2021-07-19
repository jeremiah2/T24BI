package cabs.t24bi.reports.controller;

import cabs.t24bi.reports.model.INDIVIDUAL_REC;
import cabs.t24bi.reports.service.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class IndividualController {

    @Autowired
    IndividualService individualService;

    // Fetch all user records
    @GetMapping
    public List<INDIVIDUAL_REC> getAllUsers(){
        return individualService.getAllUsers();
    }
    // Fetch single user
    @GetMapping("/{id}")
    public INDIVIDUAL_REC getUserById(@PathVariable("id") int userId){
        return individualService.getUserById(userId);
    }


}

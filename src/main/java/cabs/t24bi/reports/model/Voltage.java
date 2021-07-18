package cabs.t24bi.reports.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voltage {

    @Id
    @GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "contract_code")
    private String contractCode;
    private String customerCode;
    @Column(name = "nationalid")
    private String nationalID;
}

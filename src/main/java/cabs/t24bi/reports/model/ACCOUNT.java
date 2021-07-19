package cabs.t24bi.reports.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ACCOUNT")
public class ACCOUNT implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AC_ID")
    private Long accId;
    @Column(name="MIS_DATE")
    private String misDate;
    @Column(name="CUSTOMER")
    private String customer;
    @Column(name="CATEGORY")
    private String category;
    @Column(name="ACCOUNT_TITLE_1")
    private String accountTitle1;
    @Column(name="ACCOUNT_TITLE_2")
    private String accountTitle2;
    @Column(name="SHORT_TITLE")
    private String shortTitle;
    @Column(name="MNEMONIC")
    private String mnemonic;
    @Column(name="POSITION_TYPE")
    private String positionType;
    @Column(name="CURRENCY")
    private String currency;
    @Column(name="CURRENCY_MARKET")
    private String currencyMarket;
    @Column(name="LIMIT_REF")
    private String limitRef;
    @Column(name="ACCOUNT_OFFICER")
    private String accountOfficer;
    @Column(name="OTHER_OFFICER")
    private String otherOfficer;
    @Column(name="POSTING_RESTRICT_1")
    private String postingRestrict1;
    @Column(name="RECONCILE_ACCT")
    private String reconcileAcct;
    @Column(name="INTEREST_LIQU_ACCT")
    private String interestLiquAcct;
    @Column(name="INTEREST_COMP_ACCT")
    private String interestCompAcct;
    @Column(name="INT_NO_BOOKING")
    private String intNoBooking;
    @Column(name="REFERAL_CODE")
    private String referalCode;
    @Column(name="WAIVE_LEDGER_FEE")
    private String waiveLedgerFee;
    @Column(name="LOCAL_REF")
    private String localRef;
    @Column(name="CONDITION_GROUP")
    private String conditionGroup;
    @Column(name="INACTIV_MARKER")
    private String inactivMarker;
    @Column(name="OPEN_ACTUAL_BAL")
    private Float openActualBal;
    @Column(name="OPEN_CLEARED_BAL")
    private Float openClearedBal;
    @Column(name="ONLINE_ACTUAL_BAL")
    private Float onlineActualBal;
    @Column(name="ONLINE_CLEARED_BAL")
    private Float onlineClearedBal;
    @Column(name="WORKING_BALANCE")
    private Float workingBalance;

}

package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceAnalysis;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRetrieveInputModel
 */
public class CRManagedInvestmentPortfolioAgreementRetrieveInputModel   {
  private Object managedInvestmentPortfolioAgreementRetrieveActionTaskRecord = null;

  private String managedInvestmentPortfolioAgreementRetrieveActionRequest = null;

  private CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceReportRecord managedInvestmentPortfolioAgreementInstanceReportRecord = null;

  private CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceAnalysis managedInvestmentPortfolioAgreementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementRetrieveActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementRetrieveActionTaskRecord() {
    return managedInvestmentPortfolioAgreementRetrieveActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementRetrieveActionTaskRecord(Object managedInvestmentPortfolioAgreementRetrieveActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementRetrieveActionTaskRecord = managedInvestmentPortfolioAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return managedInvestmentPortfolioAgreementRetrieveActionRequest
  **/

  public String getManagedInvestmentPortfolioAgreementRetrieveActionRequest() {
    return managedInvestmentPortfolioAgreementRetrieveActionRequest;
  }

  public void setManagedInvestmentPortfolioAgreementRetrieveActionRequest(String managedInvestmentPortfolioAgreementRetrieveActionRequest) {
    this.managedInvestmentPortfolioAgreementRetrieveActionRequest = managedInvestmentPortfolioAgreementRetrieveActionRequest;
  }


  /**
   * Get managedInvestmentPortfolioAgreementInstanceReportRecord
   * @return managedInvestmentPortfolioAgreementInstanceReportRecord
  **/

  public CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceReportRecord getManagedInvestmentPortfolioAgreementInstanceReportRecord() {
    return managedInvestmentPortfolioAgreementInstanceReportRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReportRecord(CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceReportRecord managedInvestmentPortfolioAgreementInstanceReportRecord) {
    this.managedInvestmentPortfolioAgreementInstanceReportRecord = managedInvestmentPortfolioAgreementInstanceReportRecord;
  }


  /**
   * Get managedInvestmentPortfolioAgreementInstanceAnalysis
   * @return managedInvestmentPortfolioAgreementInstanceAnalysis
  **/

  public CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceAnalysis getManagedInvestmentPortfolioAgreementInstanceAnalysis() {
    return managedInvestmentPortfolioAgreementInstanceAnalysis;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceAnalysis(CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceAnalysis managedInvestmentPortfolioAgreementInstanceAnalysis) {
    this.managedInvestmentPortfolioAgreementInstanceAnalysis = managedInvestmentPortfolioAgreementInstanceAnalysis;
  }


}


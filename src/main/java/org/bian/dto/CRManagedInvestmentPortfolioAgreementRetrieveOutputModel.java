package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceAnalysis;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRetrieveOutputModel
 */
public class CRManagedInvestmentPortfolioAgreementRetrieveOutputModel   {
  private CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private String managedInvestmentPortfolioAgreementRetrieveActionTaskReference = null;

  private Object managedInvestmentPortfolioAgreementRetrieveActionTaskRecord = null;

  private String managedInvestmentPortfolioAgreementRetrieveActionResponse = null;

  private CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceReportRecord managedInvestmentPortfolioAgreementInstanceReportRecord = null;

  private CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceAnalysis managedInvestmentPortfolioAgreementInstanceAnalysis = null;


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Agreement instance retrieve service call 
   * @return managedInvestmentPortfolioAgreementRetrieveActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAgreementRetrieveActionTaskReference() {
    return managedInvestmentPortfolioAgreementRetrieveActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAgreementRetrieveActionTaskReference(String managedInvestmentPortfolioAgreementRetrieveActionTaskReference) {
    this.managedInvestmentPortfolioAgreementRetrieveActionTaskReference = managedInvestmentPortfolioAgreementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return managedInvestmentPortfolioAgreementRetrieveActionResponse
  **/

  public String getManagedInvestmentPortfolioAgreementRetrieveActionResponse() {
    return managedInvestmentPortfolioAgreementRetrieveActionResponse;
  }

  public void setManagedInvestmentPortfolioAgreementRetrieveActionResponse(String managedInvestmentPortfolioAgreementRetrieveActionResponse) {
    this.managedInvestmentPortfolioAgreementRetrieveActionResponse = managedInvestmentPortfolioAgreementRetrieveActionResponse;
  }


  /**
   * Get managedInvestmentPortfolioAgreementInstanceReportRecord
   * @return managedInvestmentPortfolioAgreementInstanceReportRecord
  **/

  public CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceReportRecord getManagedInvestmentPortfolioAgreementInstanceReportRecord() {
    return managedInvestmentPortfolioAgreementInstanceReportRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReportRecord(CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceReportRecord managedInvestmentPortfolioAgreementInstanceReportRecord) {
    this.managedInvestmentPortfolioAgreementInstanceReportRecord = managedInvestmentPortfolioAgreementInstanceReportRecord;
  }


  /**
   * Get managedInvestmentPortfolioAgreementInstanceAnalysis
   * @return managedInvestmentPortfolioAgreementInstanceAnalysis
  **/

  public CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceAnalysis getManagedInvestmentPortfolioAgreementInstanceAnalysis() {
    return managedInvestmentPortfolioAgreementInstanceAnalysis;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceAnalysis(CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceAnalysis managedInvestmentPortfolioAgreementInstanceAnalysis) {
    this.managedInvestmentPortfolioAgreementInstanceAnalysis = managedInvestmentPortfolioAgreementInstanceAnalysis;
  }


}


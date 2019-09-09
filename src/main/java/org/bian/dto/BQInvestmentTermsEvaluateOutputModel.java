package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord;
import org.bian.dto.BQInvestmentTermsEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsEvaluateOutputModel
 */
public class BQInvestmentTermsEvaluateOutputModel   {
  private BQInvestmentTermsEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private String investmentTermsInstanceReference = null;

  private String investmentTermsInitiateActionReference = null;

  private Object investmentTermsInitiateActionRecord = null;

  private String investmentTermsInstanceStatus = null;

  private BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord = null;


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public BQInvestmentTermsEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(BQInvestmentTermsEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Investment Terms instance 
   * @return investmentTermsInstanceReference
  **/

  public String getInvestmentTermsInstanceReference() {
    return investmentTermsInstanceReference;
  }

  public void setInvestmentTermsInstanceReference(String investmentTermsInstanceReference) {
    this.investmentTermsInstanceReference = investmentTermsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return investmentTermsInitiateActionReference
  **/

  public String getInvestmentTermsInitiateActionReference() {
    return investmentTermsInitiateActionReference;
  }

  public void setInvestmentTermsInitiateActionReference(String investmentTermsInitiateActionReference) {
    this.investmentTermsInitiateActionReference = investmentTermsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return investmentTermsInitiateActionRecord
  **/

  public Object getInvestmentTermsInitiateActionRecord() {
    return investmentTermsInitiateActionRecord;
  }

  public void setInvestmentTermsInitiateActionRecord(Object investmentTermsInitiateActionRecord) {
    this.investmentTermsInitiateActionRecord = investmentTermsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Investment Terms instance (e.g. initialised, pending, active) 
   * @return investmentTermsInstanceStatus
  **/

  public String getInvestmentTermsInstanceStatus() {
    return investmentTermsInstanceStatus;
  }

  public void setInvestmentTermsInstanceStatus(String investmentTermsInstanceStatus) {
    this.investmentTermsInstanceStatus = investmentTermsInstanceStatus;
  }


  /**
   * Get investmentTermsInstanceRecord
   * @return investmentTermsInstanceRecord
  **/

  public BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord getInvestmentTermsInstanceRecord() {
    return investmentTermsInstanceRecord;
  }

  public void setInvestmentTermsInstanceRecord(BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord) {
    this.investmentTermsInstanceRecord = investmentTermsInstanceRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementControlOutputModel
 */
public class CRManagedInvestmentPortfolioAgreementControlOutputModel   {
  private String managedInvestmentPortfolioAgreementControlActionTaskReference = null;

  private Object managedInvestmentPortfolioAgreementControlActionTaskRecord = null;

  private String managedInvestmentPortfolioAgreementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Agreement instance control processing service call 
   * @return managedInvestmentPortfolioAgreementControlActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAgreementControlActionTaskReference() {
    return managedInvestmentPortfolioAgreementControlActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAgreementControlActionTaskReference(String managedInvestmentPortfolioAgreementControlActionTaskReference) {
    this.managedInvestmentPortfolioAgreementControlActionTaskReference = managedInvestmentPortfolioAgreementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementControlActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementControlActionTaskRecord() {
    return managedInvestmentPortfolioAgreementControlActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementControlActionTaskRecord(Object managedInvestmentPortfolioAgreementControlActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementControlActionTaskRecord = managedInvestmentPortfolioAgreementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return managedInvestmentPortfolioAgreementControlActionResponse
  **/

  public String getManagedInvestmentPortfolioAgreementControlActionResponse() {
    return managedInvestmentPortfolioAgreementControlActionResponse;
  }

  public void setManagedInvestmentPortfolioAgreementControlActionResponse(String managedInvestmentPortfolioAgreementControlActionResponse) {
    this.managedInvestmentPortfolioAgreementControlActionResponse = managedInvestmentPortfolioAgreementControlActionResponse;
  }


}


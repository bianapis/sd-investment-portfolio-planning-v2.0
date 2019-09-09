package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementExchangeOutputModel
 */
public class CRManagedInvestmentPortfolioAgreementExchangeOutputModel   {
  private String managedInvestmentPortfolioAgreementExchangeActionTaskReference = null;

  private Object managedInvestmentPortfolioAgreementExchangeActionTaskRecord = null;

  private String managedInvestmentPortfolioAgreementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Agreement instance exchange service call 
   * @return managedInvestmentPortfolioAgreementExchangeActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAgreementExchangeActionTaskReference() {
    return managedInvestmentPortfolioAgreementExchangeActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAgreementExchangeActionTaskReference(String managedInvestmentPortfolioAgreementExchangeActionTaskReference) {
    this.managedInvestmentPortfolioAgreementExchangeActionTaskReference = managedInvestmentPortfolioAgreementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementExchangeActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementExchangeActionTaskRecord() {
    return managedInvestmentPortfolioAgreementExchangeActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementExchangeActionTaskRecord(Object managedInvestmentPortfolioAgreementExchangeActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementExchangeActionTaskRecord = managedInvestmentPortfolioAgreementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return managedInvestmentPortfolioAgreementExchangeActionResponse
  **/

  public String getManagedInvestmentPortfolioAgreementExchangeActionResponse() {
    return managedInvestmentPortfolioAgreementExchangeActionResponse;
  }

  public void setManagedInvestmentPortfolioAgreementExchangeActionResponse(String managedInvestmentPortfolioAgreementExchangeActionResponse) {
    this.managedInvestmentPortfolioAgreementExchangeActionResponse = managedInvestmentPortfolioAgreementExchangeActionResponse;
  }


}


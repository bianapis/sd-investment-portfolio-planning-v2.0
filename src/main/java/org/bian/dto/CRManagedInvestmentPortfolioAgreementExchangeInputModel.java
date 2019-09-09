package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementExchangeInputModelManagedInvestmentPortfolioAgreementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementExchangeInputModel
 */
public class CRManagedInvestmentPortfolioAgreementExchangeInputModel   {
  private String investmentPortfolioPlanningServicingSessionReference = null;

  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private Object managedInvestmentPortfolioAgreementExchangeActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAgreementExchangeInputModelManagedInvestmentPortfolioAgreementExchangeActionRequest managedInvestmentPortfolioAgreementExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return investmentPortfolioPlanningServicingSessionReference
  **/

  public String getInvestmentPortfolioPlanningServicingSessionReference() {
    return investmentPortfolioPlanningServicingSessionReference;
  }

  public void setInvestmentPortfolioPlanningServicingSessionReference(String investmentPortfolioPlanningServicingSessionReference) {
    this.investmentPortfolioPlanningServicingSessionReference = investmentPortfolioPlanningServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Managed Investment Portfolio Agreement instance 
   * @return managedInvestmentPortfolioAgreementInstanceReference
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceReference() {
    return managedInvestmentPortfolioAgreementInstanceReference;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReference(String managedInvestmentPortfolioAgreementInstanceReference) {
    this.managedInvestmentPortfolioAgreementInstanceReference = managedInvestmentPortfolioAgreementInstanceReference;
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
   * Get managedInvestmentPortfolioAgreementExchangeActionRequest
   * @return managedInvestmentPortfolioAgreementExchangeActionRequest
  **/

  public CRManagedInvestmentPortfolioAgreementExchangeInputModelManagedInvestmentPortfolioAgreementExchangeActionRequest getManagedInvestmentPortfolioAgreementExchangeActionRequest() {
    return managedInvestmentPortfolioAgreementExchangeActionRequest;
  }

  public void setManagedInvestmentPortfolioAgreementExchangeActionRequest(CRManagedInvestmentPortfolioAgreementExchangeInputModelManagedInvestmentPortfolioAgreementExchangeActionRequest managedInvestmentPortfolioAgreementExchangeActionRequest) {
    this.managedInvestmentPortfolioAgreementExchangeActionRequest = managedInvestmentPortfolioAgreementExchangeActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementControlInputModelManagedInvestmentPortfolioAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementControlInputModel
 */
public class CRManagedInvestmentPortfolioAgreementControlInputModel   {
  private String investmentPortfolioPlanningServicingSessionReference = null;

  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private Object managedInvestmentPortfolioAgreementControlActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAgreementControlInputModelManagedInvestmentPortfolioAgreementControlActionRequest managedInvestmentPortfolioAgreementControlActionRequest = null;


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
   * Get managedInvestmentPortfolioAgreementControlActionRequest
   * @return managedInvestmentPortfolioAgreementControlActionRequest
  **/

  public CRManagedInvestmentPortfolioAgreementControlInputModelManagedInvestmentPortfolioAgreementControlActionRequest getManagedInvestmentPortfolioAgreementControlActionRequest() {
    return managedInvestmentPortfolioAgreementControlActionRequest;
  }

  public void setManagedInvestmentPortfolioAgreementControlActionRequest(CRManagedInvestmentPortfolioAgreementControlInputModelManagedInvestmentPortfolioAgreementControlActionRequest managedInvestmentPortfolioAgreementControlActionRequest) {
    this.managedInvestmentPortfolioAgreementControlActionRequest = managedInvestmentPortfolioAgreementControlActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementUpdateInputModel
 */
public class CRManagedInvestmentPortfolioAgreementUpdateInputModel   {
  private String investmentPortfolioPlanningServicingSessionReference = null;

  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private Object managedInvestmentPortfolioAgreementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementUpdateActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementUpdateActionTaskRecord() {
    return managedInvestmentPortfolioAgreementUpdateActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementUpdateActionTaskRecord(Object managedInvestmentPortfolioAgreementUpdateActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementUpdateActionTaskRecord = managedInvestmentPortfolioAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}


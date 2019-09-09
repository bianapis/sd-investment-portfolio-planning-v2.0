package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementEvaluateInputModel
 */
public class CRManagedInvestmentPortfolioAgreementEvaluateInputModel   {
  private String investmentPortfolioPlanningServicingSessionReference = null;

  private Object managedInvestmentPortfolioAgreementEvaluateActionRecord = null;

  private String managedInvestmentPortfolioAgreementInstanceStatus = null;

  private CRManagedInvestmentPortfolioAgreementEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return managedInvestmentPortfolioAgreementEvaluateActionRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementEvaluateActionRecord() {
    return managedInvestmentPortfolioAgreementEvaluateActionRecord;
  }

  public void setManagedInvestmentPortfolioAgreementEvaluateActionRecord(Object managedInvestmentPortfolioAgreementEvaluateActionRecord) {
    this.managedInvestmentPortfolioAgreementEvaluateActionRecord = managedInvestmentPortfolioAgreementEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Managed Investment Portfolio Agreement instance (e.g. initialised, pending, active) 
   * @return managedInvestmentPortfolioAgreementInstanceStatus
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceStatus() {
    return managedInvestmentPortfolioAgreementInstanceStatus;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceStatus(String managedInvestmentPortfolioAgreementInstanceStatus) {
    this.managedInvestmentPortfolioAgreementInstanceStatus = managedInvestmentPortfolioAgreementInstanceStatus;
  }


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAgreementEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(CRManagedInvestmentPortfolioAgreementEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


}


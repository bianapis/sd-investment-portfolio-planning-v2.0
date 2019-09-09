package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementEvaluateOutputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementEvaluateOutputModel
 */
public class CRManagedInvestmentPortfolioAgreementEvaluateOutputModel   {
  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private String managedInvestmentPortfolioAgreementEvaluateActionReference = null;

  private Object managedInvestmentPortfolioAgreementEvaluateActionRecord = null;

  private String managedInvestmentPortfolioAgreementInstanceStatus = null;

  private CRManagedInvestmentPortfolioAgreementEvaluateOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return managedInvestmentPortfolioAgreementEvaluateActionReference
  **/

  public String getManagedInvestmentPortfolioAgreementEvaluateActionReference() {
    return managedInvestmentPortfolioAgreementEvaluateActionReference;
  }

  public void setManagedInvestmentPortfolioAgreementEvaluateActionReference(String managedInvestmentPortfolioAgreementEvaluateActionReference) {
    this.managedInvestmentPortfolioAgreementEvaluateActionReference = managedInvestmentPortfolioAgreementEvaluateActionReference;
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

  public CRManagedInvestmentPortfolioAgreementEvaluateOutputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(CRManagedInvestmentPortfolioAgreementEvaluateOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


}


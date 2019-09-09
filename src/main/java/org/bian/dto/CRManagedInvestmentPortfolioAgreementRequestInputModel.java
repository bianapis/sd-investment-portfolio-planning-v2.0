package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRequestInputModel
 */
public class CRManagedInvestmentPortfolioAgreementRequestInputModel   {
  private String investmentPortfolioPlanningServicingSessionReference = null;

  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private CRManagedInvestmentPortfolioAgreementRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private Object managedInvestmentPortfolioAgreementRequestActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRManagedInvestmentPortfolioAgreementRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(CRManagedInvestmentPortfolioAgreementRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementRequestActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementRequestActionTaskRecord() {
    return managedInvestmentPortfolioAgreementRequestActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementRequestActionTaskRecord(Object managedInvestmentPortfolioAgreementRequestActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementRequestActionTaskRecord = managedInvestmentPortfolioAgreementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}


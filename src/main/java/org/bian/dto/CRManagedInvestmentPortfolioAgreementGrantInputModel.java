package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementGrantInputModel
 */
public class CRManagedInvestmentPortfolioAgreementGrantInputModel   {
  private String investmentPortfolioPlanningServicingSessionReference = null;

  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private Object managedInvestmentPortfolioAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRManagedInvestmentPortfolioAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementGrantActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementGrantActionTaskRecord() {
    return managedInvestmentPortfolioAgreementGrantActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementGrantActionTaskRecord(Object managedInvestmentPortfolioAgreementGrantActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementGrantActionTaskRecord = managedInvestmentPortfolioAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRManagedInvestmentPortfolioAgreementGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRManagedInvestmentPortfolioAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}


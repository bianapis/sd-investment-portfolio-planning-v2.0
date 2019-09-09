package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRequestOutputModelManagedInvestmentPortfolioAgreementInstanceRecord
 */
public class CRManagedInvestmentPortfolioAgreementRequestOutputModelManagedInvestmentPortfolioAgreementInstanceRecord   {
  private String investmentPortfolioAgreementType = null;

  private String investmentPortfolioAgreementJurisdiction = null;

  private String investmentPortfolioAgreementValidFromToDate = null;

  private String investmentPortfolioAgreementSignatoriesResponsibleParties = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String managedInvestmentPortfolioAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of investment portfolio agreement (e.g. discretionary, trust ) 
   * @return investmentPortfolioAgreementType
  **/

  public String getInvestmentPortfolioAgreementType() {
    return investmentPortfolioAgreementType;
  }

  public void setInvestmentPortfolioAgreementType(String investmentPortfolioAgreementType) {
    this.investmentPortfolioAgreementType = investmentPortfolioAgreementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The contractual jurisdiction or coverage of the investment portfolio agreement (e.g. governed by State) 
   * @return investmentPortfolioAgreementJurisdiction
  **/

  public String getInvestmentPortfolioAgreementJurisdiction() {
    return investmentPortfolioAgreementJurisdiction;
  }

  public void setInvestmentPortfolioAgreementJurisdiction(String investmentPortfolioAgreementJurisdiction) {
    this.investmentPortfolioAgreementJurisdiction = investmentPortfolioAgreementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The term of the agreement 
   * @return investmentPortfolioAgreementValidFromToDate
  **/

  public String getInvestmentPortfolioAgreementValidFromToDate() {
    return investmentPortfolioAgreementValidFromToDate;
  }

  public void setInvestmentPortfolioAgreementValidFromToDate(String investmentPortfolioAgreementValidFromToDate) {
    this.investmentPortfolioAgreementValidFromToDate = investmentPortfolioAgreementValidFromToDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to signatories 
   * @return investmentPortfolioAgreementSignatoriesResponsibleParties
  **/

  public String getInvestmentPortfolioAgreementSignatoriesResponsibleParties() {
    return investmentPortfolioAgreementSignatoriesResponsibleParties;
  }

  public void setInvestmentPortfolioAgreementSignatoriesResponsibleParties(String investmentPortfolioAgreementSignatoriesResponsibleParties) {
    this.investmentPortfolioAgreementSignatoriesResponsibleParties = investmentPortfolioAgreementSignatoriesResponsibleParties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any associated documents, (e.g. signed agreement document, disclosures) 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The consolidated view of all of the constituent investment policy terms and conditions in any suitable format 
   * @return managedInvestmentPortfolioAgreement
  **/

  public String getManagedInvestmentPortfolioAgreement() {
    return managedInvestmentPortfolioAgreement;
  }

  public void setManagedInvestmentPortfolioAgreement(String managedInvestmentPortfolioAgreement) {
    this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
  }


}


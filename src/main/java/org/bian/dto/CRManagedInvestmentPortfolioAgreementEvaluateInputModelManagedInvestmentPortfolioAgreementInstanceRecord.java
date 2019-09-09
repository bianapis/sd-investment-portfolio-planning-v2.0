package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord
 */
public class CRManagedInvestmentPortfolioAgreementEvaluateInputModelManagedInvestmentPortfolioAgreementInstanceRecord   {
  private String customerReference = null;

  private String legalEntityReference = null;

  private String investmentPortfolioInstanceReference = null;

  private String investmentPortfolioAgreementType = null;

  private String investmentPortfolioAgreementJurisdiction = null;

  private String investmentPortfolioAgreementValidFromToDate = null;

  private String investmentPortfolioAgreementSignatoriesResponsibleParties = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String customerAgreementInstanceReference = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private String managedInvestmentPortfolioAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer for the investment portfolio 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the legal entity that is the subject of the agreement 
   * @return legalEntityReference
  **/

  public String getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(String legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the investment portfolio record of all holdings governed by this agreement 
   * @return investmentPortfolioInstanceReference
  **/

  public String getInvestmentPortfolioInstanceReference() {
    return investmentPortfolioInstanceReference;
  }

  public void setInvestmentPortfolioInstanceReference(String investmentPortfolioInstanceReference) {
    this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer master agreement that governs the product agreement 
   * @return customerAgreementInstanceReference
  **/

  public String getCustomerAgreementInstanceReference() {
    return customerAgreementInstanceReference;
  }

  public void setCustomerAgreementInstanceReference(String customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to KYC/Regulatory assessments maintained by the Party Life-Cycle Management Service Domain 
   * @return partyRelationshipProcedureInstanceReference
  **/

  public String getPartyRelationshipProcedureInstanceReference() {
    return partyRelationshipProcedureInstanceReference;
  }

  public void setPartyRelationshipProcedureInstanceReference(String partyRelationshipProcedureInstanceReference) {
    this.partyRelationshipProcedureInstanceReference = partyRelationshipProcedureInstanceReference;
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


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceReportRecord
 */
public class CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceReportRecord   {
  private String managedInvestmentPortfolioAgreementInstanceReportReference = null;

  private String managedInvestmentPortfolioAgreementInstanceReportType = null;

  private String managedInvestmentPortfolioAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return managedInvestmentPortfolioAgreementInstanceReportReference
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceReportReference() {
    return managedInvestmentPortfolioAgreementInstanceReportReference;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReportReference(String managedInvestmentPortfolioAgreementInstanceReportReference) {
    this.managedInvestmentPortfolioAgreementInstanceReportReference = managedInvestmentPortfolioAgreementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return managedInvestmentPortfolioAgreementInstanceReportType
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceReportType() {
    return managedInvestmentPortfolioAgreementInstanceReportType;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReportType(String managedInvestmentPortfolioAgreementInstanceReportType) {
    this.managedInvestmentPortfolioAgreementInstanceReportType = managedInvestmentPortfolioAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return managedInvestmentPortfolioAgreementInstanceReportParameters
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceReportParameters() {
    return managedInvestmentPortfolioAgreementInstanceReportParameters;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReportParameters(String managedInvestmentPortfolioAgreementInstanceReportParameters) {
    this.managedInvestmentPortfolioAgreementInstanceReportParameters = managedInvestmentPortfolioAgreementInstanceReportParameters;
  }


}


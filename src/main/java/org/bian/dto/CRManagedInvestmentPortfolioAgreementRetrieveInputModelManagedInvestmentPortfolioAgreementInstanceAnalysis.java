package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceAnalysis
 */
public class CRManagedInvestmentPortfolioAgreementRetrieveInputModelManagedInvestmentPortfolioAgreementInstanceAnalysis   {
  private String managedInvestmentPortfolioAgreementInstanceAnalysisReference = null;

  private String managedInvestmentPortfolioAgreementInstanceAnalysisReportType = null;

  private String managedInvestmentPortfolioAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return managedInvestmentPortfolioAgreementInstanceAnalysisReference
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceAnalysisReference() {
    return managedInvestmentPortfolioAgreementInstanceAnalysisReference;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceAnalysisReference(String managedInvestmentPortfolioAgreementInstanceAnalysisReference) {
    this.managedInvestmentPortfolioAgreementInstanceAnalysisReference = managedInvestmentPortfolioAgreementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return managedInvestmentPortfolioAgreementInstanceAnalysisReportType
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceAnalysisReportType() {
    return managedInvestmentPortfolioAgreementInstanceAnalysisReportType;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceAnalysisReportType(String managedInvestmentPortfolioAgreementInstanceAnalysisReportType) {
    this.managedInvestmentPortfolioAgreementInstanceAnalysisReportType = managedInvestmentPortfolioAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return managedInvestmentPortfolioAgreementInstanceAnalysisParameters
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceAnalysisParameters() {
    return managedInvestmentPortfolioAgreementInstanceAnalysisParameters;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceAnalysisParameters(String managedInvestmentPortfolioAgreementInstanceAnalysisParameters) {
    this.managedInvestmentPortfolioAgreementInstanceAnalysisParameters = managedInvestmentPortfolioAgreementInstanceAnalysisParameters;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceAnalysis
 */
public class CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceAnalysis   {
  private String managedInvestmentPortfolioAgreementInstanceAnalysisData = null;

  private String managedInvestmentPortfolioAgreementInstanceAnalysisReportType = null;

  private Object managedInvestmentPortfolioAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return managedInvestmentPortfolioAgreementInstanceAnalysisData
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceAnalysisData() {
    return managedInvestmentPortfolioAgreementInstanceAnalysisData;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceAnalysisData(String managedInvestmentPortfolioAgreementInstanceAnalysisData) {
    this.managedInvestmentPortfolioAgreementInstanceAnalysisData = managedInvestmentPortfolioAgreementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return managedInvestmentPortfolioAgreementInstanceAnalysisReport
  **/

  public Object getManagedInvestmentPortfolioAgreementInstanceAnalysisReport() {
    return managedInvestmentPortfolioAgreementInstanceAnalysisReport;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceAnalysisReport(Object managedInvestmentPortfolioAgreementInstanceAnalysisReport) {
    this.managedInvestmentPortfolioAgreementInstanceAnalysisReport = managedInvestmentPortfolioAgreementInstanceAnalysisReport;
  }


}


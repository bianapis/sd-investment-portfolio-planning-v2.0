package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceReportRecord
 */
public class CRManagedInvestmentPortfolioAgreementRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceReportRecord   {
  private String managedInvestmentPortfolioAgreementInstanceReportData = null;

  private String managedInvestmentPortfolioAgreementInstanceReportType = null;

  private Object managedInvestmentPortfolioAgreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return managedInvestmentPortfolioAgreementInstanceReportData
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceReportData() {
    return managedInvestmentPortfolioAgreementInstanceReportData;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReportData(String managedInvestmentPortfolioAgreementInstanceReportData) {
    this.managedInvestmentPortfolioAgreementInstanceReportData = managedInvestmentPortfolioAgreementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return managedInvestmentPortfolioAgreementInstanceReport
  **/

  public Object getManagedInvestmentPortfolioAgreementInstanceReport() {
    return managedInvestmentPortfolioAgreementInstanceReport;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReport(Object managedInvestmentPortfolioAgreementInstanceReport) {
    this.managedInvestmentPortfolioAgreementInstanceReport = managedInvestmentPortfolioAgreementInstanceReport;
  }


}


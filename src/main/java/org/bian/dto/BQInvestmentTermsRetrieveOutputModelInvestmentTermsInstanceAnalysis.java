package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceAnalysis
 */
public class BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceAnalysis   {
  private Object investmentTermsInstanceAnalysisRecord = null;

  private String investmentTermsInstanceAnalysisReportType = null;

  private String investmentTermsInstanceAnalysisParameters = null;

  private Object investmentTermsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return investmentTermsInstanceAnalysisRecord
  **/

  public Object getInvestmentTermsInstanceAnalysisRecord() {
    return investmentTermsInstanceAnalysisRecord;
  }

  public void setInvestmentTermsInstanceAnalysisRecord(Object investmentTermsInstanceAnalysisRecord) {
    this.investmentTermsInstanceAnalysisRecord = investmentTermsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return investmentTermsInstanceAnalysisReportType
  **/

  public String getInvestmentTermsInstanceAnalysisReportType() {
    return investmentTermsInstanceAnalysisReportType;
  }

  public void setInvestmentTermsInstanceAnalysisReportType(String investmentTermsInstanceAnalysisReportType) {
    this.investmentTermsInstanceAnalysisReportType = investmentTermsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return investmentTermsInstanceAnalysisParameters
  **/

  public String getInvestmentTermsInstanceAnalysisParameters() {
    return investmentTermsInstanceAnalysisParameters;
  }

  public void setInvestmentTermsInstanceAnalysisParameters(String investmentTermsInstanceAnalysisParameters) {
    this.investmentTermsInstanceAnalysisParameters = investmentTermsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return investmentTermsInstanceAnalysisReport
  **/

  public Object getInvestmentTermsInstanceAnalysisReport() {
    return investmentTermsInstanceAnalysisReport;
  }

  public void setInvestmentTermsInstanceAnalysisReport(Object investmentTermsInstanceAnalysisReport) {
    this.investmentTermsInstanceAnalysisReport = investmentTermsInstanceAnalysisReport;
  }


}


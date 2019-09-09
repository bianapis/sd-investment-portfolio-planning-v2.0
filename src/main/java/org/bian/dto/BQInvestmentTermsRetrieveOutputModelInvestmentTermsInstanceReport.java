package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceReport
 */
public class BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceReport   {
  private Object investmentTermsInstanceReportRecord = null;

  private String investmentTermsInstanceReportType = null;

  private String investmentTermsInstanceReportParameters = null;

  private Object investmentTermsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return investmentTermsInstanceReportRecord
  **/

  public Object getInvestmentTermsInstanceReportRecord() {
    return investmentTermsInstanceReportRecord;
  }

  public void setInvestmentTermsInstanceReportRecord(Object investmentTermsInstanceReportRecord) {
    this.investmentTermsInstanceReportRecord = investmentTermsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return investmentTermsInstanceReportType
  **/

  public String getInvestmentTermsInstanceReportType() {
    return investmentTermsInstanceReportType;
  }

  public void setInvestmentTermsInstanceReportType(String investmentTermsInstanceReportType) {
    this.investmentTermsInstanceReportType = investmentTermsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return investmentTermsInstanceReportParameters
  **/

  public String getInvestmentTermsInstanceReportParameters() {
    return investmentTermsInstanceReportParameters;
  }

  public void setInvestmentTermsInstanceReportParameters(String investmentTermsInstanceReportParameters) {
    this.investmentTermsInstanceReportParameters = investmentTermsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return investmentTermsInstanceReport
  **/

  public Object getInvestmentTermsInstanceReport() {
    return investmentTermsInstanceReport;
  }

  public void setInvestmentTermsInstanceReport(Object investmentTermsInstanceReport) {
    this.investmentTermsInstanceReport = investmentTermsInstanceReport;
  }


}


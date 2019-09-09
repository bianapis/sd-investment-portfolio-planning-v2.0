package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceAnalysis;
import org.bian.dto.BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsRetrieveInputModel
 */
public class BQInvestmentTermsRetrieveInputModel   {
  private Object investmentTermsRetrieveActionTaskRecord = null;

  private String investmentTermsRetrieveActionRequest = null;

  private BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceReport investmentTermsInstanceReport = null;

  private BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceAnalysis investmentTermsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return investmentTermsRetrieveActionTaskRecord
  **/

  public Object getInvestmentTermsRetrieveActionTaskRecord() {
    return investmentTermsRetrieveActionTaskRecord;
  }

  public void setInvestmentTermsRetrieveActionTaskRecord(Object investmentTermsRetrieveActionTaskRecord) {
    this.investmentTermsRetrieveActionTaskRecord = investmentTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return investmentTermsRetrieveActionRequest
  **/

  public String getInvestmentTermsRetrieveActionRequest() {
    return investmentTermsRetrieveActionRequest;
  }

  public void setInvestmentTermsRetrieveActionRequest(String investmentTermsRetrieveActionRequest) {
    this.investmentTermsRetrieveActionRequest = investmentTermsRetrieveActionRequest;
  }


  /**
   * Get investmentTermsInstanceReport
   * @return investmentTermsInstanceReport
  **/

  public BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceReport getInvestmentTermsInstanceReport() {
    return investmentTermsInstanceReport;
  }

  public void setInvestmentTermsInstanceReport(BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceReport investmentTermsInstanceReport) {
    this.investmentTermsInstanceReport = investmentTermsInstanceReport;
  }


  /**
   * Get investmentTermsInstanceAnalysis
   * @return investmentTermsInstanceAnalysis
  **/

  public BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceAnalysis getInvestmentTermsInstanceAnalysis() {
    return investmentTermsInstanceAnalysis;
  }

  public void setInvestmentTermsInstanceAnalysis(BQInvestmentTermsRetrieveInputModelInvestmentTermsInstanceAnalysis investmentTermsInstanceAnalysis) {
    this.investmentTermsInstanceAnalysis = investmentTermsInstanceAnalysis;
  }


}


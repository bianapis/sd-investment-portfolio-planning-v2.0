package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRequestOutputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementRequestOutputModel
 */
public class CRManagedInvestmentPortfolioAgreementRequestOutputModel   {
  private CRManagedInvestmentPortfolioAgreementRequestOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private String managedInvestmentPortfolioAgreementRequestActionTaskReference = null;

  private Object managedInvestmentPortfolioAgreementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAgreementRequestOutputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(CRManagedInvestmentPortfolioAgreementRequestOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Agreement instance request service call 
   * @return managedInvestmentPortfolioAgreementRequestActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAgreementRequestActionTaskReference() {
    return managedInvestmentPortfolioAgreementRequestActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAgreementRequestActionTaskReference(String managedInvestmentPortfolioAgreementRequestActionTaskReference) {
    this.managedInvestmentPortfolioAgreementRequestActionTaskReference = managedInvestmentPortfolioAgreementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementRequestActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementRequestActionTaskRecord() {
    return managedInvestmentPortfolioAgreementRequestActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementRequestActionTaskRecord(Object managedInvestmentPortfolioAgreementRequestActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementRequestActionTaskRecord = managedInvestmentPortfolioAgreementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}


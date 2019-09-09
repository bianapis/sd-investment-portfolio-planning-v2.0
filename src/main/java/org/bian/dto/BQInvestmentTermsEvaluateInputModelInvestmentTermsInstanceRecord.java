package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord
 */
public class BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord   {
  private String investmentPortfolioAgreementTermType = null;

  private String investmentPortfolioAgreementTermDescription = null;

  private String investmentPortfolioAgreementTermConstraints = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of term (e.g. risk appetite, forbidden securities/sectors) 
   * @return investmentPortfolioAgreementTermType
  **/

  public String getInvestmentPortfolioAgreementTermType() {
    return investmentPortfolioAgreementTermType;
  }

  public void setInvestmentPortfolioAgreementTermType(String investmentPortfolioAgreementTermType) {
    this.investmentPortfolioAgreementTermType = investmentPortfolioAgreementTermType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the term defining how it is to be interpreted, applicable for behavioral controls (e.g. limit of exposure to a segment property or level of risk) 
   * @return investmentPortfolioAgreementTermDescription
  **/

  public String getInvestmentPortfolioAgreementTermDescription() {
    return investmentPortfolioAgreementTermDescription;
  }

  public void setInvestmentPortfolioAgreementTermDescription(String investmentPortfolioAgreementTermDescription) {
    this.investmentPortfolioAgreementTermDescription = investmentPortfolioAgreementTermDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: One or more specific constraint parameters that calibrate the term, applicable for position constraints (e.g. the specific percentage limit of holdings by value that can be applied to a type of security) 
   * @return investmentPortfolioAgreementTermConstraints
  **/

  public String getInvestmentPortfolioAgreementTermConstraints() {
    return investmentPortfolioAgreementTermConstraints;
  }

  public void setInvestmentPortfolioAgreementTermConstraints(String investmentPortfolioAgreementTermConstraints) {
    this.investmentPortfolioAgreementTermConstraints = investmentPortfolioAgreementTermConstraints;
  }


}


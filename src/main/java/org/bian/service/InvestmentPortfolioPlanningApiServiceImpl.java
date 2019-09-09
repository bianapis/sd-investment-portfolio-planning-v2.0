/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class InvestmentPortfolioPlanningApiServiceImpl implements InvestmentPortfolioPlanningApiService {

	public SDInvestmentPortfolioPlanningActivateOutputModel activate(SDInvestmentPortfolioPlanningActivateInputModel request){
		return JsonReader.read("activate-SDInvestmentPortfolioPlanningActivateOutputModel.json",new TypeReference<SDInvestmentPortfolioPlanningActivateOutputModel>(){});
	}
	
	public SDInvestmentPortfolioPlanningConfigureOutputModel configure(String sdReferenceId, SDInvestmentPortfolioPlanningConfigureInputModel request){
		return JsonReader.read("configure-SDInvestmentPortfolioPlanningConfigureOutputModel.json",new TypeReference<SDInvestmentPortfolioPlanningConfigureOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementControlInputModel request){
		return JsonReader.read("control-CRManagedInvestmentPortfolioAgreementControlOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAgreementControlOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRManagedInvestmentPortfolioAgreementEvaluateInputModel request){
		return JsonReader.read("evaluate-CRManagedInvestmentPortfolioAgreementEvaluateOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAgreementEvaluateOutputModel>(){});
	}
	
	public BQInvestmentTermsEvaluateOutputModel evaluateInvestmentterms(String sdReferenceId, String crReferenceId, BQInvestmentTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQInvestmentTermsEvaluateOutputModel.json",new TypeReference<BQInvestmentTermsEvaluateOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementExchangeInputModel request){
		return JsonReader.read("exchange-CRManagedInvestmentPortfolioAgreementExchangeOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAgreementExchangeOutputModel>(){});
	}
	
	public SDInvestmentPortfolioPlanningFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentPortfolioPlanningFeedbackInputModel request){
		return JsonReader.read("feedback-SDInvestmentPortfolioPlanningFeedbackOutputModel.json",new TypeReference<SDInvestmentPortfolioPlanningFeedbackOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementGrantInputModel request){
		return JsonReader.read("grant-CRManagedInvestmentPortfolioAgreementGrantOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAgreementGrantOutputModel>(){});
	}
	
	public BQInvestmentTermsRequestOutputModel requestInvestmentterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInvestmentTermsRequestInputModel request){
		return JsonReader.read("request-BQInvestmentTermsRequestOutputModel.json",new TypeReference<BQInvestmentTermsRequestOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementRequestInputModel request){
		return JsonReader.read("request-CRManagedInvestmentPortfolioAgreementRequestOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAgreementRequestOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRManagedInvestmentPortfolioAgreementRetrieveOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAgreementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQInvestmentTermsRetrieveOutputModel retrieveInvestmentterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInvestmentTermsRetrieveOutputModel.json",new TypeReference<BQInvestmentTermsRetrieveOutputModel>(){});
	}
	
	public SDInvestmentPortfolioPlanningRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInvestmentPortfolioPlanningRetrieveOutputModel.json",new TypeReference<SDInvestmentPortfolioPlanningRetrieveOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementUpdateInputModel request){
		return JsonReader.read("update-CRManagedInvestmentPortfolioAgreementUpdateOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAgreementUpdateOutputModel>(){});
	}
	
	public BQInvestmentTermsUpdateOutputModel updateInvestmentterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInvestmentTermsUpdateInputModel request){
		return JsonReader.read("update-BQInvestmentTermsUpdateOutputModel.json",new TypeReference<BQInvestmentTermsUpdateOutputModel>(){});
	}
	
}

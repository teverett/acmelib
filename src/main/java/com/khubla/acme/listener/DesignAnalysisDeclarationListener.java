package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class DesignAnalysisDeclarationListener extends AbstractListener {
	public DesignAnalysis designAnalysis;

	@Override
	public void enterAcmeDesignAnalysisDeclaration(AcmeDesignAnalysisDeclarationContext ctx) {
		designAnalysis = new DesignAnalysis();
		// throw new RuntimeException("Not Implemented");
		// TODO
	}
}

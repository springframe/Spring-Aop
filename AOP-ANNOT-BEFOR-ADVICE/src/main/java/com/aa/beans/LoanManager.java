package com.aa.beans;

import org.springframework.stereotype.Component;

@Component("lm")
public class LoanManager {
		public boolean approveLoan(int loanNo) {
			return true;
		}
	
}

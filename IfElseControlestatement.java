package com.vstl.javatraining;

public class IfElseControlestatement {

	
	public void verifySteelstrenth(int intweight) {
	if (intweight>=2388) {
		System.out.println("high Strenth steel");
	}else if (intweight<2388 && intweight<=2467){
		System.out.println("medium Strenth steel");
	}else{
		System.out.println("low Strenth steel");
	}
	
	}

// if else if ladder
	
	public void verifyMarks(int intMarks) {
	if(intMarks>80) {System.out.println("topper");}
	else if(intMarks<80 &&  intMarks>=65 ){System.out.println("first A grade");}
	else if(intMarks<65 && intMarks>=45) {System.out.println("B grade");}
	else {System.out.println("only pass");}

	}

	
	//Nested if else
	public void VerifyBankStatement(int intAmount) {

     if(intAmount>500) {
    	 {System.out.println(" start Saving Account");
    	 }
    	 if(intAmount>100) {
     System.out.println("not start saving account");
     }
    	 else {
    		 System.out.println("saving account activated");
    	 }
     }
     }
}
     


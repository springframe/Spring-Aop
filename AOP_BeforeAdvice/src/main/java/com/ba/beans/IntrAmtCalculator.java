package com.ba.beans;

public class IntrAmtCalculator {

	public float intrAmtCal(float priciple,float rate,float time)
	{
		return (priciple*rate*time)/100.0f;
	}
   public float rateCal(float priciple,float simpleIntrest,float time)
   {
	   return (simpleIntrest*100)/(priciple*time);

   }
   public float timeCal(float priciple,float simpleIntrest,float rate)
   {
	   return (simpleIntrest*100)/(priciple*rate);

   }
   public float principleCal(float rate,float simpleIntrest,float time)
   {
	   return (simpleIntrest*100)/(rate*time);

   }
}

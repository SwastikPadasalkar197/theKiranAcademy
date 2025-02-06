package com.tka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {
/**	
	@Before("execution (public void recharge())")
	public void beforeMsg() {
     System.out.println("U R recharge expiring soon.Pls recharge");
	}
	
	@After("execution (public void recharge())")
    public void afterMsg() {
	 System.out.println("enjoy your data pack");
	}
**/	
	@Around("execution (* com.tka.entity.MobileRecharge.*())")
	public void aroundMsg(ProceedingJoinPoint pj) {
		System.out.println("U R recharge expiring soon ... plz recharge");
	
	    try {
	    	pj.proceed();
	    }catch(Throwable e) {
	    	e.printStackTrace();
	    }
	    System.out.println("enjoy UR data Pack ...!");
	}
}

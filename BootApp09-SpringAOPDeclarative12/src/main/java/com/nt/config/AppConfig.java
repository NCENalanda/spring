package com.nt.config;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.aspect.CacheAdvice;
import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.service.IntrestAmountCalculator;

@Configuration
@ComponentScan(basePackages={"com.nt.aspect","com.nt.service"})
public class AppConfig {
	@Autowired
	private IntrestAmountCalculator iac;
	@Autowired
	private PerformanceMonitoringAdvice pmAdvice;
	@Autowired
	private CacheAdvice cacheAdvice;
	
	@Bean(name="repa1")
	public  Advisor  createREPA1(){
	    RegexpMethodPointcutAdvisor  advisor;
	    advisor=new RegexpMethodPointcutAdvisor();
	    advisor.setAdvice(pmAdvice);
	    advisor.setPattern(".*calcSimple.*");
	    return advisor;
	}
	
	@Bean(name="repa2")
	public  Advisor  createREPA2(){
	    RegexpMethodPointcutAdvisor  advisor;
	    advisor=new RegexpMethodPointcutAdvisor();
	    advisor.setAdvice(cacheAdvice);
	    advisor.setPatterns(".*calcComp.*",".*calcSimple.*");
	    
	    return advisor;
	}
	
	@Bean("pfb")
	public  ProxyFactoryBean  createPFB(){
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(iac);
		pfb.setInterceptorNames("repa2","repa1");
		return pfb;
	}
	
	@Bean("getProxy")
	public  IntrestAmountCalculator createProxy(){
		return  (IntrestAmountCalculator) createPFB().getObject();
	}
	
	

}

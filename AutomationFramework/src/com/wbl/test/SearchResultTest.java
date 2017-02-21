package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;
import com.wbl.page.SearchResultPage;

public class SearchResultTest extends BaseTest{
		SearchResultPage sp;
		HomePage hm;
		
		@BeforeClass
		public void before(){
			  hm =new HomePage(driver);
		      sp=new SearchResultPage(driver);
		}	  
		
		@Test
		public void testresult(){
			Assert.assertEquals("$1,699.00",sp.sortResult());
			}

}
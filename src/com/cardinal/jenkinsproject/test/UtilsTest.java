package com.cardinal.jenkinsproject.test;

import android.test.AndroidTestCase;
import android.webkit.ValueCallback;

import com.cardinal.jenkinsproject.utils.AppHelper;

public class UtilsTest extends AndroidTestCase {

    public final void testUtilsDummyTestPass(){
	int expectedValue = 1;
	
	AppHelper myAppHelper = new AppHelper();
	int returnedValue = myAppHelper.getValue();
	
	//Check if the two values are equal
	assertEquals(expectedValue, returnedValue);
    }
    public final void testUtilsDummyTestFail(){
   	int expectedValue = 2;
   	
   	AppHelper myAppHelper = new AppHelper();
   	int returnedValue = myAppHelper.getValue();
   	
   	//Check if the two values are equal
   	assertEquals(expectedValue, returnedValue);
   	
   	//AndroidTestCase.
       }
    
    
}

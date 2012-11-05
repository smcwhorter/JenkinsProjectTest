package com.cardinal.jenkinsproject.test;

import android.R.integer;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.test.InstrumentationTestCase;
import android.widget.TextView;

import com.cardinal.jenkinsproject.MainActivity;


public class ActivityTest extends InstrumentationTestCase {

    
   final public void testMainActivity() {
     String expectedReString = "Hello world!";
     int tvLabelID=0x7f070000;
       
       Instrumentation thisInstrumentation = getInstrumentation();
       // Register we are interested in the authentication activiry...
       Instrumentation.ActivityMonitor monitor = thisInstrumentation.addMonitor(MainActivity.class.getName(), null, false);

       // Start the authentication activity as the first activity...
       Intent intent = new Intent(Intent.ACTION_MAIN);
       intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
       intent.setClassName(thisInstrumentation.getTargetContext(), MainActivity.class.getName());
       thisInstrumentation.startActivitySync(intent);

       // Wait for it to start...
       Activity currentActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5);
       
       //Make sure the activity is not null
       assertNotNull(currentActivity);
       
       TextView tvLabel = (TextView)currentActivity.findViewById(tvLabelID);
       String results = tvLabel.getText().toString();
       
       assertEquals(expectedReString, results);
   }
}

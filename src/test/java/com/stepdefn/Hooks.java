package com.stepdefn;


import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.utilsdata.Baseclass.*;
import java.io.IOException;

import com.utilsdata.Baseclass;


public class Hooks {
	//control slash
	@Before
	public void setUP() throws IOException
	{
		initDriver();
	}

	@After
	public void teardown(){
		tearDown();
	}
}

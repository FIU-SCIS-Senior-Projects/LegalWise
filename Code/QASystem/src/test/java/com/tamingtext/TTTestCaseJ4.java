/*
 * Copyright 2008-2011 Grant Ingersoll, Thomas Morton and Drew Farris
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 * -------------------
 * To purchase or learn more about Taming Text, by Grant Ingersoll, Thomas Morton and Drew Farris, visit
 * http://www.manning.com/ingersoll
 */

package com.tamingtext;


import org.apache.solr.SolrTestCaseJ4;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

/**
 *
 *
 **/
public class TTTestCaseJ4 extends SolrTestCaseJ4 {
  @BeforeClass
  public static void initTTTestCase(){
    Locale.setDefault(localeForName("en_us"));

    TamingTextTestJ4.setUp();
  }
  
  @Test
  public void justTest()
  {
	  Assert.assertTrue(true);
  }

}


import resources.FunctionalTestScriptHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author karthick_ba
 */
public class FunctionalTestScript extends FunctionalTestScriptHelper
{
	/**
	 * Script Name   : <b>FunctionalTestScript</b>
	 * Generated     : <b>06-Aug-2024 8:32:32 am</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2024/08/06
	 * @author karthick_ba
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().click(atPath("Composers->Beethoven->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Beethoven->Symphony No. 7"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(102,11));
		placeAnOrder().inputChars("7677 8888 8999 9888");
		expirationDate().click(atPoint(34,9));
		placeAnOrder().inputKeys("/28{BKSP}{BKSP}{BKSP}{BKSP}2/25{BKSP}7");
		placeOrder2().click();
		
		// 
		ok2().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}


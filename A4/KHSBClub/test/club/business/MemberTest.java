/* FileName: MemberTest.java
 * Purpose: JUnit testing
 * Revision History:
 *          Khaleel Hamid & Steve Bulgin, 2015.04.04: Created
 */

package club.business;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author khamid-cc
 */
public class MemberTest extends TestCase {
    
    public MemberTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MemberTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getFullName method, of class Member.
     */
    public void testGetFullName() {
        System.out.println("getFullName");
        Member instance = new Member();
        String expResult = "Khaleel";
        instance.setFullName(expResult);
        String result = instance.getFullName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFullName method, of class Member.
     */
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "Khaleel Hamid";
        Member instance = new Member();
        instance.setFullName(fullName);
        String result = instance.getFullName();
        assertEquals(fullName, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmailAddress method, of class Member.
     */
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Member instance = new Member();
        String expResult = "khaleel@hotmail.com";
        instance.setEmailAddress(expResult);
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmailAddress method, of class Member.
     */
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "khaleel@hotmail.com";
        Member instance = new Member();
        instance.setEmailAddress(emailAddress);
        String result = instance.getEmailAddress();
        assertEquals(emailAddress, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPhoneNumber method, of class Member.
     */
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Member instance = new Member();
        String expResult = "5192123456";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPhoneNumber method, of class Member.
     */
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "5192123456";
        Member instance = new Member();
        instance.setPhoneNumber(phoneNumber);
        String result = instance.getPhoneNumber();
        assertEquals(phoneNumber, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getProgramName method, of class Member.
     */
    public void testGetProgramName() {
        System.out.println("getProgramName");
        Member instance = new Member();
        String expResult = "CPA";
        instance.setProgramName(expResult);
        String result = instance.getProgramName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setProgramName method, of class Member.
     */
    public void testSetProgramName() {
        System.out.println("setProgramName");
        String programName = "CPA";
        Member instance = new Member();
        instance.setProgramName(programName);
        String result = instance.getProgramName();
        assertEquals(programName, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getYearLevel method, of class Member.
     */
    public void testGetYearLevel() {
        System.out.println("getYearLevel");
        Member instance = new Member();
        int expResult = 0;
        instance.setYearLevel(expResult);
        int result = instance.getYearLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setYearLevel method, of class Member.
     */
    public void testSetYearLevel() {
        System.out.println("setYearLevel");
        int yearLevel = 0;
        Member instance = new Member();
        instance.setYearLevel(yearLevel);
        int result = instance.getYearLevel();
        assertEquals(yearLevel, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isValid method, of class Member.
     */
    public void testValidPostive() {
        System.out.println("isPostive");
        Member instance = new Member();
        instance.setFullName("John");
        instance.setEmailAddress("hamid@hotmail.com");
        boolean expResult = true;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testValidNegative() {
        System.out.println("isNegative");
        Member instance = new Member();
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

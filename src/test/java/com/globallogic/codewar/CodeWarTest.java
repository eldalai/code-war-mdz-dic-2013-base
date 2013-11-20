package com.globallogic.codewar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CodeWarTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CodeWarTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CodeWarTest.class );
    }

    public void testDiamondsAreForever()
    {
    	String actual = Diamonds.drawDiamond("a", 5);
    	String expected =
//2345
"    a\n"+//1
"   a a\n"+//2
"  a   a\n"+//3
" a     a\n"+//4
"a       a\n"+//5
" a     a\n"+//4
"  a   a\n"+//3
"   a a\n"+//2
"    a\n";//1
//2345    	
		assertEquals("el diamante a x 5 no es como debiera", expected, actual);

		actual = Diamonds.drawDiamond("b", 1);
    	expected =
"b\n";
		assertEquals("el diamante b x 1 no es como debiera", expected, actual);

    	actual = Diamonds.drawDiamond("c", 3);
    	expected =
//23    			
"  c\n"+
" c c\n"+
"c   c\n"+
" c c\n"+
"  c\n";
//23    	
		assertEquals("el diamante c x 3 no es como debiera", expected, actual);
    
    	actual = Diamonds.drawDiamond("d", 2);
    	expected =
" d\n"+
"d d\n"+
" d\n";
		assertEquals("el diamante d x 2 no es como debiera", expected, actual);
    

    	actual = Diamonds.drawDiamond("e", 4);
    	expected =
//234
"   e\n"+
"  e e\n"+
" e   e\n"+
"e     e\n"+
" e   e\n"+
"  e e\n"+
"   e\n";
//234
		assertEquals("el diamante e x 4 no es como debiera", expected, actual);
		
    	actual = Diamonds.drawDiamond("f", 8);
    	expected =
//2345678    			
"       f\n"+//1
"      f f\n"+//2
"     f   f\n"+//3
"    f     f\n"+//4
"   f       f\n"+//5
"  f         f\n"+//6
" f           f\n"+//7
"f             f\n"+//8
" f           f\n"+//7
"  f         f\n"+//6
"   f       f\n"+//5
"    f     f\n"+//4
"     f   f\n"+//3
"      f f\n"+//2
"       f\n";//1
//2345678
    	assertEquals("el diamante f x 8 no es como debiera", expected, actual);
		
    	actual = Diamonds.drawDiamond("g", 13);
    	expected =
//234567890123
"            g\n"+//1
"           g g\n"+//2
"          g   g\n"+//3
"         g     g\n"+//4
"        g       g\n"+//5
"       g         g\n"+//6
"      g           g\n"+//7
"     g             g\n"+//8
"    g               g\n"+//9
"   g                 g\n"+//10
"  g                   g\n"+//11
" g                     g\n"+//12
"g                       g\n"+//13
" g                     g\n"+//12
"  g                   g\n"+//11
"   g                 g\n"+//10
"    g               g\n"+//9
"     g             g\n"+//8
"      g           g\n"+//7
"       g         g\n"+//6
"        g       g\n"+//5
"         g     g\n"+//4
"          g   g\n"+//3
"           g g\n"+//2
"            g\n";//1
//234567890123
    	assertEquals("el diamante g x 13 no es como debiera", expected, actual);
		

    }
}

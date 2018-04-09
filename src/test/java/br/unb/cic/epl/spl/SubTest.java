package br.unb.cic.epl.spl;

import junit.framework.TestCase;
import br.unb.cic.epl.spl.sub.*;

public class SubTest extends TestCase{
	public void testPrint() {
		Literal lhs = new Literal(5);
		Literal rhs = new Literal(3);
		Sub result_sub = new Sub(lhs, rhs);
		assertEquals("(5 - 3)", result_sub.print());
	}
}

package br.unb.cic.epl.spl;

import junit.framework.TestCase;
import br.unb.cic.epl.spl.mult.*;

public class MultTest extends TestCase{
	public void testPrint() {
		Literal lhs = new Literal(5);
		Literal rhs = new Literal(3);
		Mult result_mult = new Mult(lhs, rhs);
		assertEquals("(5 * 3)", result_mult.print());
	}
}

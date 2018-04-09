package br.unb.cic.epl.spl;

import junit.framework.TestCase;
import br.unb.cic.epl.spl.add.*;

public class AddTest extends TestCase{
	public void testPrint() {
		Literal lhs = new Literal(5);
		Literal rhs = new Literal(3);
		Add result_add = new Add(lhs, rhs);
		assertEquals("(5 + 3)", result_add.print());
	}
}

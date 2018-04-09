package br.unb.cic.epl.spl.eval;
import br.unb.cic.epl.spl.add.*;
import br.unb.cic.epl.spl.sub.*;
import br.unb.cic.epl.spl.mult.*;

public aspect EvalTest {
	public void br.unb.cic.epl.spl.LiteralTest.testEval() {
		br.unb.cic.epl.spl.Literal lit = new br.unb.cic.epl.spl.Literal(1000);
		assertEquals(new Integer(1000), lit.eval());
	}
	
	public void br.unb.cic.epl.spl.AddTest.testEval() {
		br.unb.cic.epl.spl.Literal lhs = new br.unb.cic.epl.spl.Literal(5);
		br.unb.cic.epl.spl.Literal rhs = new br.unb.cic.epl.spl.Literal(3);
		Add result_add = new Add(lhs, rhs);
		assertEquals(new Integer(8), result_add.eval());
	}
	
	public void br.unb.cic.epl.spl.SubTest.testEval() {
		br.unb.cic.epl.spl.Literal lhs = new br.unb.cic.epl.spl.Literal(5);
		br.unb.cic.epl.spl.Literal rhs = new br.unb.cic.epl.spl.Literal(3);
		Sub result_sub = new Sub(lhs, rhs);
		assertEquals(new Integer(2), result_sub.eval());
	}
	
	public void br.unb.cic.epl.spl.MultTest.testEval() {
		br.unb.cic.epl.spl.Literal lhs = new br.unb.cic.epl.spl.Literal(5);
		br.unb.cic.epl.spl.Literal rhs = new br.unb.cic.epl.spl.Literal(3);
		Mult result_mult = new Mult(lhs, rhs);
		assertEquals(new Integer(15), result_mult.eval());
	}
}

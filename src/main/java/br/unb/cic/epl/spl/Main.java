package br.unb.cic.epl.spl;

import java.util.ArrayList;
import java.util.List;

import br.unb.cic.epl.spl.add.*;
import br.unb.cic.epl.spl.sub.*;
import br.unb.cic.epl.spl.mult.*;
import br.unb.cic.epl.spl.eval.*;

public class Main {
	private static Main instance; 
	
	private Main() {} 
	
	public static Main instance() {
		if(instance == null) {
			instance = new Main();
		}
		return instance; 
	}
	public List<Expression> expressions = new ArrayList<Expression>();; 
	
	
	public void createExpressions() {
		expressions.add(new Literal(100));
		expressions.add(new Literal(10));
	}
	
	
	public static void main(String args[]) {
		instance().createExpressions();
		
		Add result_add = new Add(new Literal(5), new Literal(3));
		Sub result_sub = new Sub(new Literal(5), new Literal(3));
		Mult result_mult = new Mult(new Literal(5), new Literal(3));
		Add result_add_multiple = new Add(result_sub, result_sub);
		
		
		System.out.println(result_add.print());
		System.out.println(result_add.eval());
		System.out.println(result_add.height());
		System.out.println(result_sub.print());
		System.out.println(result_sub.eval());
		System.out.println(result_sub.height());
		System.out.println(result_mult.print());
		System.out.println(result_mult.eval());
		System.out.println(result_mult.height());
		System.out.println(result_add_multiple.print());
		System.out.println(result_add_multiple.eval());
		System.out.println(result_add_multiple.height());
		
		
		
		for(Expression e: instance().expressions) {
			System.out.println(e.print());
		}
	}
}

package br.com.caelum.cap11.sec12;

import java.util.ArrayList;
import java.util.List;

public class TestaErroMemoria {

	public static void main(String[] args) {
		
		boolean loop = true;
		
		List<Integer> lista = new ArrayList<Integer>();
		System.out.println(Runtime.getRuntime().freeMemory());
		
		while (loop) {
			try {
				lista.add(new Integer(1));
			} catch (OutOfMemoryError err) {
				System.out.println(Runtime.getRuntime().freeMemory());
			}
		}
		//
	}
}

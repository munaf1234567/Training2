package com.exilant.day3.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class jatesto2 {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngineManager sem= new ScriptEngineManager();
		ScriptEngine nashn= sem.getEngineByName("nashorn");
		nashn.eval(new FileReader("resources/com/js/ext.js"));
		System.out.println(nashn.eval("fnterst()"));
		System.out.println(nashn.eval("sayhel1o('harry')"));
	}

}

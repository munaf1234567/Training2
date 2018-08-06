package com.exilant.day3.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JStext {

	public static void main(String[] args) throws ScriptException {
	ScriptEngineManager sem= new ScriptEngineManager();
	ScriptEngine nashon= sem.getEngineByName("nashorn");
	String name="anuj";
	nashon.eval("print('"+name+"')");
	Integer res=(Integer) nashon.eval("10 + 20");
	System.out.println(res);
	
	}

}

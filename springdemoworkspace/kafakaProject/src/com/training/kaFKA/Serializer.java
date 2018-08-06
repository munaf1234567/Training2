package com.training.kaFKA;

import java.io.*;
import java.util.Map;

public interface Serializer extends Closeable<T>{
	void configure(Map<String, ?> var1, boolean var2);
	  byte[] serialize(String var1, T var2);
	  void close();

}
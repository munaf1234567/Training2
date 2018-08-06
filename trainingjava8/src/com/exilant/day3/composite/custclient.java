package com.exilant.day3.composite;

public class custclient {

	public static void main(String[] args) {
		
customar c1= new customar(101, "bir1");
customar c2= new customar(102, "bir2");
customar c3= new customar(103, "bir3");
customar c4= new customar(104, "bir4");
customar c5= new customar(105, "bir5");
customar c6= new customar(106, "bir6");
customar c7= new customar(107, "bir7");
customar c8= new customar(107, "bir8");
customar c9= new customar(107, "bir9");
c1.addRef(c2);
c1.addRef(c3);
c1.addRef(c4);



c2.addRef(c5);
c2.addRef(c6);


c4.addRef(c7);
c4.addRef(c8);
c4.addRef(c9);



System.out.println("printing all tehe ref");
System.out.println(c1.getCustname());
for(customar c:c1.getRef())
{
	System.out.println(c.getCustid()+"---->"+c.getCustname());
}


	}

}

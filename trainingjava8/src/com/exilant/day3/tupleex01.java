package com.exilant.day3;

class MyTuple<A,B,C>
{
	A _aa;
	B _bb;
	C _cc;
	public A get_aa() {
		return _aa;
	}
	public void set_aa(A _aa) {
		this._aa = _aa;
	}
	public B get_bb() {
		return _bb;
	}
	public void set_bb(B _bb) {
		this._bb = _bb;
	}
	public C get_cc() {
		return _cc;
	}
	public void set_cc(C _cc) {
		this._cc = _cc;
	}
	@Override
	public String toString() {
		return "MyTuple [_aa=" + _aa + ", _bb=" + _bb + ", _cc=" + _cc + "]";
	}
	public MyTuple(A _aa, B _bb, C _cc) {
		super();
		this._aa = _aa;
		this._bb = _bb;
		this._cc = _cc;
	}
	public MyTuple() {
		super();
	}
	
	
}

class Emp
{
	
}

class Dept
{
	
}
class Somethiing
{
	
}



public class tupleex01 {
	
	
	public static MyTuple<Integer,String ,Boolean> newtuple(){
		return new MyTuple(100,"hello",true);
		
	}
	
	public static MyTuple<Emp,Dept ,Somethiing> newtcustuple(){
		return new MyTuple(new Emp(),new Dept(),new Somethiing());
		
	}
	

	
	public static void main(String [] args)
	{
		
		MyTuple<Integer,String ,Boolean> tup=newtuple();
		System.out.println(tup.get_aa());
		System.out.println(tup.get_bb());
		System.out.println(tup.get_cc());
		
		MyTuple<Emp,Dept ,Somethiing> tup1= newtcustuple();
		System.out.println(tup1.get_aa());
		System.out.println(tup1.get_bb());
		System.out.println(tup1.get_cc());
		
		
	}

}

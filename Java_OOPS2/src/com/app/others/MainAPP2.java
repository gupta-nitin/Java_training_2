package com.app.others;

class MainAPP2 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.funa();
		d1.funx();
	}
}

class Demo extends X implements a, b {
	
	public void funx() {
		System.out.println("funx() of class idemo1");
	}

	public void funy() {
		System.out.println("funy() of class idemo1");
	}

	public void funi() {
		System.out.println("funi() of class idemo1");
	}

}

class X {
	void funa() {
		System.out.println("funa() of class a");
	}

}

interface a {
	public void funx();

	public void funy();
}

interface b {
	public void funi();
}

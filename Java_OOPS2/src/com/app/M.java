package com.app;
 
class M implements c {
	public void funx() {
		System.out.println("funx() of class m");
	}

	public void funy() {
		System.out.println("funy() of class m");
	}

	public void funm() {
		System.out.println("funm of class m");
	}

	public void funi() {
		System.out.println("funi() of class m");
	}

	public static void main(String args[]) {
		M x1 = new M();
		x1.funx();
		x1.funy();
	}
}

interface a {
	public void funx();

	public void funy();
}

interface b {
	public void funi();
}

interface c extends a, b {
	public void funm();
}

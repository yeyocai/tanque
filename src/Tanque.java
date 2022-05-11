
public class Tanque {
	
//	private String modo = "normal";
	private ModoTanque modo = new ModoNormal();
	//int vida = 100; le saque private para que pueda acceder metodo restarVida()
	
	public void cambiarModo() {
//		this.modo = this.modo.equals("normal") ? "asedio" : "normal";
		this.modo = this.modo.cambiarModo();
		
		//1
		//this.vida -= this.modo.vidaARestar();
		
		//2
		//this.modo.restarVida(this);
	}

	public void atacar() {
//		if(this.modo.equals("normal")) {
//			System.out.println("10 de danio");
//		} else {
//			System.out.println("20 de danio");
//		}
		this.modo.atacar();
	}
	
	public void mover() {
//		if(this.modo.equals("normal")) {
//			System.out.println("me muevo");
//		} else {
//			System.out.println("no me muevo");
//		}
		this.modo.mover();
	}
	
	public static void main(String[] args) {
		Tanque t = new Tanque();
		
		t.mover();
		t.atacar();
		
		t.cambiarModo();
		
		t.mover();
		t.atacar();
		
		t.cambiarModo();
		
		t.mover();
		t.atacar();
	}
}

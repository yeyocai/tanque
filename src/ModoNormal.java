
public class ModoNormal extends ModoTanque {

	@Override
	public void atacar() {
		System.out.println("10 de danio");
	}
	
	@Override
	public void mover() {
		System.out.println("me muevo");
	}

	@Override
	public ModoTanque cambiarModo() {
		return new ModoAsedio();
	}
	
	//@Override
	//protected void restarVida(Tanque tanque) {
	//	tanque.vida--;
	//}

}

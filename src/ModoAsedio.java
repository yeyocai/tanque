
public class ModoAsedio extends ModoTanque {

	@Override
	public void atacar() {
		System.out.println("20 de danio");
	}
	
	@Override
	public void mover() {
		System.out.println("no me muevo");
	}

	@Override
	public ModoTanque cambiarModo() {
		return new ModoNormal();
	}
	
	// modo asedio
}

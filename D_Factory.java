public class D_Factory implements GameFactory {
	@Override
	public Game Start() {
		return new D_Game();
	}
}
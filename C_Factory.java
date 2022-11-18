public class C_Factory implements GameFactory{
	@Override
	public Game Start() {
		return new C_Game();
	}
}
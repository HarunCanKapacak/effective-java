package Example.DependencyInjection;

public class YazýAnaliziDependencyInjection {
	
	private final Sözlük sözlük;

	public YazýAnaliziDependencyInjection(Sözlük sözlük) {
		this.sözlük = sözlük;
	}
	
	public boolean isValid() {
		return true;
	}

}

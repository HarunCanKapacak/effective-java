package Example.OverridingEqualsAndHashCode;

import java.util.Objects;

public class DenemeSýnýfOverride {
	
	int a;
	int b;
	public DenemeSýnýfOverride(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DenemeSýnýfOverride other = (DenemeSýnýfOverride) obj;
		return a == other.a && b == other.b;
	}

}

package Example.TypesafeHeteregenousMap;

import java.util.HashMap;
import java.util.Objects;

public class Favorites implements FavoritesContract {

	private HashMap<Class<?>, Object> favorites = new HashMap();

	public <T> void putFavorite(Class<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), instance);
	}

	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}

	public void herhangi() {

	}

	public static void main(String[] args) {

		FavoritesContract f = new Favorites();
		f.putFavorite(String.class, "Java");
		f.putFavorite(Integer.class, 123);
		f.putFavorite(Class.class, Favorites.class);

		String s = f.getFavorite(String.class);
		int i = f.getFavorite(Integer.class);
		Class<?> c = f.getFavorite(Class.class);

		System.out.println(s + i + c.getName());

	}


}



















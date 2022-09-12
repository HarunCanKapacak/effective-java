package Example.EnumsAndStrategyDesignPattern;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation {

	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},

	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		public double apply(double x, double y) {
			return x / y;
		}
	};

	private final String symbol;

	Operation(String symbol) {
		this.symbol = symbol;
	}

	public String toString() {
		return symbol;
	}

	public abstract double apply(double x, double y);
	
	private static final Map<String, Operation> stringToEnum = Stream.of(values()).collect(Collectors.toMap(Object::toString, e-> e));
	
	public static Optional<Operation> fromString(String symbol){
		return Optional.ofNullable(stringToEnum.get(symbol));
	}
	
	public static void main(String[] args) {
		
		double x = 2;
		double y = 4;
		
		for(Operation op : Operation.values())
			System.out.printf("%f %s %f = %f%n",x, op,y,op.apply(x, y));
		
		System.out.println(Operation.fromString("+"));
		System.out.println(Operation.stringToEnum);
	}
	
	
	
}


































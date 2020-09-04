package progetto_lpo.visitors.evaluation;
import progetto_lpo.type.Season;

public interface Value {
	/* default conversion methods */
	default int toInt() {
		throw new EvaluatorException("Expecting an integer");
	}

	default boolean toBool() {
		throw new EvaluatorException("Expecting a boolean");
	}
	
	default Season toSeason () {
		throw new EvaluatorException ("Expecting an integer");
	}

	default PairValue toProd() {
		throw new EvaluatorException("Expecting a pair");
	}

	//PROGETTO
	default int toNum() {
		throw new EvaluatorException("Expecting a season");
	}

	//PROGETTO
	default boolean compare(Object obj) {throw new EvaluatorException("Expecting comparable elements");}
}

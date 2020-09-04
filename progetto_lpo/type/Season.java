package progetto_lpo.type;

import progetto_lpo.visitors.evaluation.EvaluatorException;

public enum Season {
	Winter,Spring,Summer,Fall;

	public static Season parseSeason(String s) {
			return valueOf(s);
	}

	public static Season getInstance(int x) {
		try {
				return values()[x];
		} catch(ArrayIndexOutOfBoundsException exception) {
			throw new EvaluatorException(String.valueOf(exception));
		}
	}
}
package progetto_lpo.visitors.evaluation;

import progetto_lpo.type.*;
public class IntValue extends PrimValue<Integer> {

	public IntValue(Integer value) {
		super(value);
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof IntValue))
			return false;
		return value.equals(((IntValue) obj).value);
	}

	@Override
	public int toInt() {
		return value;
	}

	@Override
	public Season toSeason() {
		return Season.getInstance(value);
	}

	@Override
	public final boolean compare(Object obj) {
		if (this == obj)
			return false ;
		if (!(obj instanceof IntValue))
			throw new EvaluatorException("Expecting an integer");
		
		return value < ((IntValue) obj).value;
	}
}
	

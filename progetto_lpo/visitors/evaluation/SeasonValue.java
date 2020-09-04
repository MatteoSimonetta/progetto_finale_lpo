package progetto_lpo.visitors.evaluation;
import progetto_lpo.type.Season;

public class SeasonValue extends PrimValue<Season> {

	public SeasonValue(Season value) {
		super(value);
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SeasonValue))
			return false;
		return value.equals(((SeasonValue) obj).value);
	}
	
	@Override
	public int toNum() {
		return value.ordinal();
	}

	//PROGETTO
	@Override
	public final boolean compare(Object obj) {
		if (this == obj)
			return false ;
		if (!(obj instanceof SeasonValue))
			throw new EvaluatorException("Expecting a season");
		else
			return value.ordinal() < ((SeasonValue) obj).toNum();
	}

}
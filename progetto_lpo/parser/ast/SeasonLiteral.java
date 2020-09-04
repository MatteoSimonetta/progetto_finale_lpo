package progetto_lpo.parser.ast;

import progetto_lpo.visitors.Visitor;
import progetto_lpo.type.Season;

public class SeasonLiteral extends PrimLiteral<Season> {

	public SeasonLiteral(Season value) {
		super(value);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitSeasonLiteral(value);
	}
}

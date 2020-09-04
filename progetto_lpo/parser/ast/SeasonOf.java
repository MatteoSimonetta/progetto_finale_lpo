package progetto_lpo.parser.ast;


import progetto_lpo.visitors.Visitor;

public class SeasonOf extends UnaryOp {

	public SeasonOf(Exp exp) {
		super(exp);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitSeasonOf(exp);
	}
}
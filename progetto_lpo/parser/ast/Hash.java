package progetto_lpo.parser.ast;

import progetto_lpo.visitors.Visitor;

public class Hash extends UnaryOp {

	public Hash(Exp exp) {
		super(exp);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitHash(exp);
	}
}

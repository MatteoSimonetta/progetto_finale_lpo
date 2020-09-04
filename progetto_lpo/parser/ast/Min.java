package progetto_lpo.parser.ast;

import progetto_lpo.visitors.Visitor;

public class Min extends BinaryOp {
	public Min(Exp left, Exp right) {
		super(left, right);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitMin(left, right);
	}
}

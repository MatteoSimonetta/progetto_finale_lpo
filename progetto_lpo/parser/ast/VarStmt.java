package progetto_lpo.parser.ast;

import progetto_lpo.visitors.Visitor;

public class VarStmt extends AbstractAssignStmt {

	public VarStmt(VarIdent ident, Exp exp) {
		super(ident, exp);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitVarStmt(ident, exp);
	}
}

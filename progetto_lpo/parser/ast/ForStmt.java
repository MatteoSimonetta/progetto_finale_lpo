package progetto_lpo.parser.ast;

import progetto_lpo.visitors.Visitor;

import static java.util.Objects.requireNonNull;

public class ForStmt implements Stmt{
    private final VarIdent Ident;
    private final Exp exp;
    private final Block forBlock;

    public ForStmt(VarIdent Ident, Exp exp, Block forBlock) {
        this.Ident = requireNonNull(Ident);
        this.exp = requireNonNull(exp);
        this.forBlock = requireNonNull(forBlock);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + Ident + "," + exp + "," + forBlock + ")";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitForStmt(Ident, exp, forBlock);
    }
}

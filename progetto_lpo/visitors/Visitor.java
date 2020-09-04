package progetto_lpo.visitors;

import progetto_lpo.parser.ast.Block;
import progetto_lpo.parser.ast.Exp;
import progetto_lpo.parser.ast.Stmt;
import progetto_lpo.parser.ast.StmtSeq;
import progetto_lpo.parser.ast.VarIdent;
import progetto_lpo.type.Season;

public interface Visitor<T> {
	T visitAdd(Exp left, Exp right);
	
	T visitMin(Exp left,Exp right);

	T visitAssignStmt(VarIdent ident, Exp exp);

	T visitIntLiteral(int value);

	T visitEq(Exp left, Exp right);

	T visitMoreStmt(Stmt first, StmtSeq rest);

	T visitForStmt(VarIdent Ident, Exp exp, Block ForBlock);

	T visitMul(Exp left, Exp right);

	T visitPrintStmt(Exp exp);

	T visitProg(StmtSeq stmtSeq);

	T visitSign(Exp exp);

	T visitVarIdent(VarIdent id); // the only corner case ...

	T visitSingleStmt(Stmt stmt);

	T visitVarStmt(VarIdent ident, Exp exp);

	T visitNot(Exp exp);
	
	T visitSeasonOf(Exp exp);
	
	T visitHash(Exp exp);

	T visitAnd(Exp left, Exp right);

	T visitBoolLiteral(boolean value);
	
	T visitSeasonLiteral (Season value);

	T visitIfStmt(Exp exp, Block thenBlock, Block elseBlock);

	T visitBlock(StmtSeq stmtSeq);

	T visitPairLit(Exp left, Exp right);

	T visitFst(Exp exp);

	T visitSnd(Exp exp);
}

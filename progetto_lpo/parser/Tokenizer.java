package progetto_lpo.parser;

import java.io.IOException;
import progetto_lpo.type.Season;

public interface Tokenizer extends AutoCloseable {

	TokenType next() throws TokenizerException;

	TokenType tokenType();

	String tokenString();

	int intValue();
	
	Season SeasonValue();

	boolean boolValue();

	public void close() throws IOException;

	int getLineNumber();

}
package com.khubla.acme;

import java.io.*;

import org.antlr.v4.runtime.*;

import com.khubla.acme.domain.*;
import com.khubla.acme.listener.*;

public class ACMEReader {
	public static acmeParser parse(InputStream inputStream) throws IOException {
		/*
		 * make Lexer
		 */
		final Lexer lexer = new acmeLexer(CharStreams.fromStream(inputStream));
		/*
		 * get a TokenStream on the Lexer
		 */
		final TokenStream tokenStream = new CommonTokenStream(lexer);
		/*
		 * make a Parser on the token stream
		 */
		return new acmeParser(tokenStream);
	}

	public static Design parseDesign(InputStream inputStream) throws IOException {
		final acmeParser parser = parse(inputStream);
		final DesignDeclarationListener designListener = new DesignDeclarationListener();
		parser.acmeCompUnit().enterRule(designListener);
		return designListener.getDesign();
	}
}

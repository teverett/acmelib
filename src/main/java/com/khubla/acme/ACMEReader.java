package com.khubla.acme;

import java.io.*;

import org.antlr.v4.runtime.*;

import com.khubla.acme.domain.*;

public class ACMEReader {
	public static acmeParser parse(InputStream inputStream) throws IOException {
		/*
		 * make Lexer
		 */
		Lexer lexer = new acmeLexer(CharStreams.fromStream(inputStream));
		/*
		 * get a TokenStream on the Lexer
		 */
		TokenStream tokenStream = new CommonTokenStream(lexer);
		/*
		 * make a Parser on the token stream
		 */
		return new acmeParser(tokenStream);
	}

	public static Design parseDesign(InputStream inputStream) throws IOException {
		acmeParser parser = parse(inputStream);
		return null;
	}
}

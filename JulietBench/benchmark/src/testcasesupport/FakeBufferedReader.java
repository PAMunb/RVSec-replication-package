package testcasesupport;

import java.io.*;


public class FakeBufferedReader extends BufferedReader {
    public FakeBufferedReader(Reader in) {
	super(in);
    }
    
    @Override
    public String readLine() throws IOException {
	return "fake input data";
    }
}


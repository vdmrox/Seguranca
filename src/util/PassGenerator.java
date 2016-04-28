package util;

import org.jboss.security.Base64Encoder;

public class PassGenerator {
	public static void main(String[] args) throws Exception {
		Base64Encoder.main(new String[] { "carlos", "SHA-256" });
	}
	//0/qDP8nnFm7EDUsT/cRH/OUMeujbBbsC7qeYgNvjuLg=
	//rzDjjtc1NNwdQoGAHiBvwybwQx7FaMvqytEAxLBPsYk=
}

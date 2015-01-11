package groovysh


@Grab(group='commons-codec', module='commons-codec', version='1.10')
import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

String SECRET_KEY = "7kd1eqlo";

Mac hmacSHA256 = Mac.getInstance("HmacSHA256");
SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "HmacSHA256");
hmacSHA256.init(secretKey);

String email = "victor@cs.com";
byte[] output = hmacSHA256.doFinal(email.getBytes());
String hash = Hex.encodeHexString(output);

println hash;

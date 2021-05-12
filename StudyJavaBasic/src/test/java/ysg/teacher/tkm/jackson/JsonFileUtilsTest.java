package ysg.teacher.tkm.jackson;

import org.junit.BeforeClass;
import org.junit.Test;

public class JsonFileUtilsTest {

	private static JsonFileUtils target;

	private static final String FILE = "test.json";
	@BeforeClass
	public static void init() {
		target = new JsonFileUtils(FILE);
	}

	@Test
	public void testReadJson() {
		target.readJson();
		target.writeJson(FILE);
	}

}

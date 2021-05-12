package ysg.teacher.tkm.jackson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonFileUtils {
	/** 対象ファイル */
	private File targetFile;

	public JsonFileUtils(String fileName) {
		try {
			targetFile = Paths.get("src/main/resources", fileName).toFile();
			if (targetFile == null) {
				throw new Exception(fileName + "が見つかりません");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readJson() {
		ObjectMapper obMapper = new ObjectMapper();
		try {
			DataA data = obMapper.readValue(targetFile, DataA.class);
		    // print map entries
		    System.out.println(data.getId() + " : " + data.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeJson(String value) {
		DataA data = new DataA();
		data.setId(2);
		data.setName("jiro");
		data.setSikaku(new String[] { "あああ", "いいい"});
		ObjectMapper mapper = new ObjectMapper();
		try {
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(targetFile, data);
		} catch (Exception e) {

		}
	}
}

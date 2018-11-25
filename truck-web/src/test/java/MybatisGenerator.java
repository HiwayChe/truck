import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cheguangai
 * @date 2018/11/25 0025
 */
public class MybatisGenerator {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisGenerator.class);

	public static void main(String... args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		LOGGER.info("开始逆向生成代码");
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("E:\\git\\truck\\truck-web\\src\\test\\java\\mybatis-generator-config.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		LOGGER.info("逆向生成代码结束");
	}
}

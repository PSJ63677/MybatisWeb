package common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
		
	// 객체 생성없이 바로 사용할 수 있는 메소드(스테틱 메소드)
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		String resource = "mybatis-config.xml";
		
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(is);
			session = factory.openSession();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return session;
			
	}

}

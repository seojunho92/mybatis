package config;

import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Configuration {
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
		
			Reader reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			/*
			InputStream stream = Resources.getResourceAsStream("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream, "hr");	// 디폴트값인 경우 stream에서 끝내면 된다.
			*/
		} catch(Exception e) {}
	}
	
	public static<T> T getMapper(Class<T> arg) {
		return sqlSessionFactory.openSession(true).getMapper(arg); // openSession(true) : DML도 오토커밋 하게한다.
	}
}

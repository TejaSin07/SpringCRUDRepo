package in.tejas.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao{
	private JdbcTemplate jdbctemplate;
	
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public boolean save() {
		String sql = "insert into book values(2,'C language',20000)";
		jdbctemplate.execute(sql);
		return true;
	}
}

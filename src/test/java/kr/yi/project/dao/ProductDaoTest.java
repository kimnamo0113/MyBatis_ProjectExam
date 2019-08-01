package kr.yi.project.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import kr.yi.project.model.Project;
import kr.yi.project.util.MySqlSessionFactory;

public class ProductDaoTest {

	@Test
	public void selectListByAll() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MySqlSessionFactory.openSession();
			ProjectDao dao = sqlSession.getMapper(ProjectDao.class);
			List<Project> list = dao.selectListByAll();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

	}

	@Test
	public void selectByNo() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MySqlSessionFactory.openSession();
			ProjectDao dao = sqlSession.getMapper(ProjectDao.class);
			Project project = dao.selectByNo(1);
			System.out.println(project);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

	}

	@Test
	public void update() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MySqlSessionFactory.openSession();
			ProjectDao dao = sqlSession.getMapper(ProjectDao.class);
			int no=1;
			Project project = new Project(1, "dd", "11", new Date("2019-10-10"), new Date("2019-10-10"), "헤헤");
			int res=dao.update(project);
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

	}

	@Test
	public void delete() {
		SqlSession sqlSession = null;
		sqlSession = MySqlSessionFactory.openSession();
		ProjectDao dao = sqlSession.getMapper(ProjectDao.class);

		int result = -1;
		try {
			result = dao.delete(1);
			if (result > 0)
				sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

	}
	@Test
	public void insert() {
		SqlSession sqlSession = null;
		sqlSession = MySqlSessionFactory.openSession();
		ProjectDao dao = sqlSession.getMapper(ProjectDao.class);
		
		int result = -1;
		try {
			Project project = new Project(100, "dd", "11", new Date("2019-10-10"), new Date("2019-10-10"), "헤헤");
			result = dao.insert(project);
			if (result > 0)
				sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
	}
}

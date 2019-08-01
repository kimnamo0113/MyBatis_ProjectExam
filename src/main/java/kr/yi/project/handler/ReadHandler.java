package kr.yi.project.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import kr.yi.project.controller.CommandHandler;
import kr.yi.project.dao.ProjectDao;
import kr.yi.project.model.Project;
import kr.yi.project.util.MySqlSessionFactory;

public class ReadHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")) {
			SqlSession sqlSession = null;
			int no=Integer.parseInt(req.getParameter("no"));
			
			try {
				sqlSession=MySqlSessionFactory.openSession();
				ProjectDao dao=sqlSession.getMapper(ProjectDao.class);
				
				Project project = dao.selectByNo(no);
				req.setAttribute("project", project);
				
				return "/WEB-INF/view/read.jsp";
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
		}
		return null;
	}
	
}

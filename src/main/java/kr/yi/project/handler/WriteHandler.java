package kr.yi.project.handler;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import kr.yi.project.controller.CommandHandler;
import kr.yi.project.dao.ProjectDao;
import kr.yi.project.model.Project;
import kr.yi.project.util.MySqlSessionFactory;

public class WriteHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		SqlSession sqlSession = null;
		sqlSession = MySqlSessionFactory.openSession();
		ProjectDao dao = sqlSession.getMapper(ProjectDao.class);
		
		if(req.getMethod().equalsIgnoreCase("get")) {
			String nostr=req.getParameter("no");
			int no=-1;
			if(nostr!=null)
				no=Integer.parseInt(nostr);
			if(no>0) {
				Project project=dao.selectByNo(no);
				req.setAttribute("project", project);
			}
			
			return "/WEB-INF/view/write.jsp";
		}
		else if(req.getMethod().equalsIgnoreCase("post")) {
			
			String name = req.getParameter("name");
			String content = req.getParameter("content");
			String startdate = req.getParameter("startdate");
			String enddate = req.getParameter("enddate");
			String state = req.getParameter("state");
			String nostr=req.getParameter("no");
			int no=-1;
			if(nostr!=null)
				 no= Integer.parseInt(nostr);
			
			
			SimpleDateFormat sd = new SimpleDateFormat("yyyyy-mm-dd");
			Project project = new Project(-1,name,content,sd.parse(startdate),sd.parse(enddate),state);
			try {
				
				int result=-1;
				if(no>0) {
					result = dao.update(project);
				}
				else {
					result = dao.insert(project);
				}
				if(result<0) {
					throw new RuntimeException("fail to insert article table");
				}
				sqlSession.commit();
				System.out.println(req.getContextPath());
				res.sendRedirect(req.getContextPath()+"/list.do");
				return null; //forward 막힘
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
		}            
		return null;
	}

}

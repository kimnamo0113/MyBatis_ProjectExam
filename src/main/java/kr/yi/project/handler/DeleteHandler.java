package kr.yi.project.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import kr.yi.project.controller.CommandHandler;
import kr.yi.project.dao.ProjectDao;
import kr.yi.project.util.MySqlSessionFactory;

public class DeleteHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nostr=req.getParameter("no");
		if(req.getMethod().equalsIgnoreCase("get")) {
			SqlSession sqlSession = null;
			sqlSession = MySqlSessionFactory.openSession();
			ProjectDao dao = sqlSession.getMapper(ProjectDao.class);
			           
			int num=-1;
			if(nostr!=null)
				num=Integer.parseInt(nostr);
			int result=-1;
			try {             
				result=dao.delete(num);
				if(result>0)
					sqlSession.commit();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return "list.do";
		}
		return null;
	}

}

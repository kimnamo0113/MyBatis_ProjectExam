package kr.yi.project.dao;

import java.util.List;

import kr.yi.project.model.Project;

public interface ProjectDao {

	List<Project> selectListByAll();

	int insert(Project project);

	Project selectByNo(int no);

	int update(Project project);

	int delete(int no);
	
}

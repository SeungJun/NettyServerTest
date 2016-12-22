package io.server.web.dao;

import io.server.web.vo.Member;

import java.util.List;

/**
 * Created by sjwood on 2016. 12. 22..
 */
public interface MemberDao {
    List<Member> selectList() throws Exception;
    int insert(Member member) throws Exception;
    int delete(int no) throws Exception;
    Member selectOne(int no) throws Exception;
    int update(Member member) throws Exception;
    Member exist(String email, String password) throws Exception;
    List<Member> paging(int currentPage, int pagesize) throws Exception;
}

package egovframework.cms.board.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import egovframework.cms.board.service.BoardMasterVO;

@Repository
public class BoardMasterDAOImpl implements BoardMasterDAO{
	
	 private final SqlSession sqlSession;
	    private final String namespace = "egovframework.cms.board.mapper.BoardMasterMapper";

	    public BoardMasterDAOImpl(SqlSession sqlSession) {
	        this.sqlSession = sqlSession;
	    }

	    @Override
	    public void insertBoard(BoardMasterVO boardMasterVO) {
	        sqlSession.insert(namespace + ".insertBoard", boardMasterVO);
	    }

	    @Override
	    public List<BoardMasterVO> selectBoardList() {
	        return sqlSession.selectList(namespace + ".selectBoardList");
	    }

	    @Override
	    public BoardMasterVO selectBoardByCode(String boardCode) {
	        return sqlSession.selectOne(namespace + ".selectBoardByCode", boardCode);
	    }
	    
	    @Override
	    public void updateBoard(BoardMasterVO boardMasterVO) {
	        sqlSession.update(namespace + ".updateBoard", boardMasterVO);
	    }
	    
	    @Override
	    public void deleteBoard(String boardCode) {
	        sqlSession.delete(namespace + ".deleteBoard", boardCode);
	    }
	    
	    @Override
	    public List<BoardMasterVO> selectBoardMasterList() {
	        return sqlSession.selectList(namespace + ".selectBoardMasterList");
	    }
}

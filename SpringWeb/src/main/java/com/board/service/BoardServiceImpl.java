package com.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;
import com.board.model.BoardVO;
import com.board.model.PagingVO;
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public int insertBoard(BoardVO board) {
		
		return boardMapper.insertBoard(board);
	}

	@Override
	public List<BoardVO> selectBoardAll(Map<String, Integer> map) {
		
		return this.boardMapper.selectBoardAll(map);
	}

	@Override
	public List<BoardVO> selectBoardAllPaging(PagingVO paging) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCount() {
		
		return this.boardMapper.getTotalCount();
	}

	@Override
	public int getTotalCount(PagingVO paging) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO selectBoardByIdx(int num) {
		
		return this.boardMapper.selectBoardByIdx(num);
	}

	@Override
	public int updateReadnum(int num) {
		
		return this.boardMapper.updateReadnum(num);
	}

	@Override
	public int deleteBoard(int num) {
		
		return this.boardMapper.deleteBoard(num);
	}

	@Override
	public int updateBoard(BoardVO board) {
		
		return this.boardMapper.updateBoard(board);
	}

	@Override
	public int rewriteBoard(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO selectRefLevSunbun(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateSunbun(BoardVO parent) {
		// TODO Auto-generated method stub
		return 0;
	}

}

package club.twxit.utils;

import club.twxit.vo.ResultVO;

public class ResultVOUtil {
  public static ResultVO success(Object object){
	  ResultVO resultVO = new ResultVO<>();
	  resultVO.setCode(0);
	  resultVO.setData(object);
	  resultVO.setMessage("SUCCESS");
	  return resultVO;
  }
}

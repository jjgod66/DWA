package kr.or.dw.command;

import kr.or.dw.vo.PdsVO;
import lombok.Data;

@Data
public class PdsModifyCommand extends PdsRegistCommand {

	private int[] deleteFile;

	@Override
	public PdsVO toPdsVO() {
		PdsVO pds = super.toPdsVO();
		return pds;
	}
	
}

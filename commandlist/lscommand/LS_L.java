package lscommand;

import commandlist.CommandVO;

public class LS_L extends AbstractLS {

	@Override
	protected String getOperateParam() {
		return super.L_PARAM;
	}

	@Override
	protected String echo(CommandVO vo) {
		return FileManager.ls_l(vo.formatData());
	}

}

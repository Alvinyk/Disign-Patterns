package dfcommand;

import commandlist.Command;
import commandlist.CommandName;
import commandlist.CommandVO;

public class DFCommand extends Command {

	@Override
	public String execute(CommandVO vo) {
		CommandName firstNode = (CommandName)super.buildChain(AbstractDF.class).get(0);
		return firstNode.handleMessage(vo);
	}

}

package commandlist;

public class Invoker {
	
	public String exec(String _commandStr) {
		String result = "系统无此命令";
		
		CommandVO vo = new CommandVO(_commandStr);
		
		if(CommandEnum.getNames().contains(vo.getCommandName())) {
			String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
			
			Command command;
			try{
				command = (Command) Class.forName(className).newInstance();
				result = command.execute(vo);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}

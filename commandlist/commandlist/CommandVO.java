package commandlist;

import java.util.ArrayList;
import java.util.HashSet;

public class CommandVO {
	public final static String DIVIDE_PLAG = " ";
	
	public final static String PREFIX = "-";
	
	private String commandName = "";
	
	private ArrayList<String> paramList = new ArrayList<>();
	
	private ArrayList<String> dataList = new ArrayList<>();
	
	public CommandVO(String commandStr) {
		if(commandStr != null && commandStr.length() != 0) {
			String[] complexStr = commandStr.split(CommandVO.DIVIDE_PLAG);
			
			this.commandName = complexStr[0];
			
			for(int i=1; i<complexStr.length; i++) {
				String str = complexStr[i].trim();
				
				if(str.indexOf(CommandVO.PREFIX) == 0) {
					str = str.replace(CommandVO.PREFIX, "").trim();
					this.paramList.add(str);
				}else {
					this.dataList.add(str);
				}
			}
		}else {
			System.out.println("命令解析失败，必须传递一个命令才能执行");
		}
	}
	
	
	public String getCommandName() {
		return this.commandName;
	}
	
	
	public ArrayList<String> getParams(){
		if(this.paramList.isEmpty()) {
			this.paramList.add("");
		}
		return new ArrayList<String>(new HashSet<String>(this.paramList));
	}
	
	public ArrayList<String> getDatas(){
		return this.dataList;
	}
	
	public String formatData() {
		return ".";
	}
}

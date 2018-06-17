package commandlist;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


public class ClassUtils {
	
	public static List<Class> getSonClass(Class fatherClass){
		List<Class> sonClasses = new ArrayList<Class>();
		
		String packageName = fatherClass.getPackage().getName();
		
		List<Class> packClasses = getClasses(packageName);
		
		for(Class c : packClasses) {
			if(fatherClass.isAssignableFrom(c) && !fatherClass.equals(c)) {
				sonClasses.add(c);
			}
		}
		
		return sonClasses;
	}
	
	
	
	private static List<Class> getClasses(String packageName){
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		
		String path = packageName.replace('.' ,'/');
		
		Enumeration<URL> resources = null;
		
		try {
			resources = classloader.getResources(path);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		List<File> dirs = new ArrayList<File>();
		while(resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		
		ArrayList<Class> classes = new ArrayList<Class>();
		
		for(File dir : dirs) {
			classes.addAll(findClasses(dir,packageName));
		}
		
		return classes;
	}
	
	private static List<Class> findClasses(File directory,String packageName){
		
		List<Class> classes = new ArrayList<Class>();
		if(directory.exists() == false) {
			return classes;
		}
		
		File[] files = directory.listFiles();
		
		for(File file : files) {
			if(file.isDirectory()) {
				assert(file.getName().contains(".") == false);
				classes.addAll(findClasses(file,packageName+"."+file.getName()));
			}else if(file.getName().endsWith(".class")) {
				try {
					String className = file.getName().substring(0, file.getName().length() - 6);	
					classes.add(Class.forName(packageName+"." + className));
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	
		return classes;
	}
}











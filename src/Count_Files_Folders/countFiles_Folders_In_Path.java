package Count_Files_Folders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class countFiles_Folders_In_Path {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
String path = "C:\\Users\\S141\\Desktop";
File file = new File(path);

int filecount = 0;
int foldercount =0;

String str[] = file.list();
for(String s : str)
{
	File allfile = new File(file,s);
	if(allfile.isFile())
	{
		filecount++;
	}
	
	if(allfile.isDirectory())
	{
		foldercount++;
	}
	System.out.println(allfile);
	}

System.out.println("Total files: " + filecount);
System.out.println("Total folders: " + foldercount);

	}

}

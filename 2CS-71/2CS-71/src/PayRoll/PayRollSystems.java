package PayRoll;

import java.util.*;
import java.io.*;

public class PayRollSystems{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename = args[0];
		String staffType = args[1];
		int numStaff = Integer.parseInt(args[2]);
		Staff[] recArr = new Staff[numStaff];
								
		BufferedReader infile = new BufferedReader(
					new FileReader(filename)
				);
		for (int i = 0; i < recArr.length; i++) {
			String info = infile.readLine();
			recArr[i] = (Staff) Class.forName(staffType).newInstance();
			recArr[i].formatInfo(info);
			recArr[i].computePay();
		}	
	}

}
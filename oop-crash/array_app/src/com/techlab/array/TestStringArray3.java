package com.techlab.array;

public class TestStringArray3 {
	public String[] getNameContainS(String name[]) {
		String newname[] = new String[name.length];
		int j = 0;
		for (int i = 0; i < name.length; i++)
			if (name[i].contains("s")) {

				newname[j] = name[i];
				j++;

			}

		return newname;

	}
}

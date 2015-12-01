
public class BSTree2 
{
	int list[];

	public BSTree2()
	{
		this.list = new int[100];
	}

	public void insert(int x)
	{
		int idx = 0;
		boolean insertChild = false;
		while(!insertChild)
		{
			if (list[idx] == 0)
			{
				list[idx] = x;
				insertChild = true;
			}
			else
			{
				if(x < list[idx])
				{
					idx = 2*(idx) + 1;
				}
				else 
				{
					idx = 2*(idx) + 2;
				}
			}
		}
	}
	
	public void inorder()
	{
		inorder(0);
	}
	private void inorder(int idx)
	{
		if(list[idx] != 0)
		{
			inorder(2*(idx) + 1);
			System.out.print(list[idx] + " ");
			inorder (2*(idx) + 2);
		}
	}

	public int findMin()
	{
		int idx = 0;
		while(true)
		{
			if(list[2*idx +1] != 0)
			{
				idx = 2*(idx) +1;
			}
			else {
				return list[idx];
			}
		}
	}
	public int findMax()
	{
		int idx = 0;
		while(true)
		{
			if(list[2*idx +2] != 0)
			{
				idx = 2*(idx) +2;
			}
			else {
				return list[idx];
			}
		}
	}

//	public int findMax()
//	{
//
//	}
}


public class TestBST2 
{
	public static void main(String[] args) 
	{
		BSTree2 list  = new BSTree2();
		list.insert(13);
		list.insert(45);
		list.insert(10);
		list.insert(9);
		list.insert(54);
		list.insert(11);
		list.insert(42);
		list.inorder();
		System.out.println("\n" + list.findMin());
		System.out.println("\n" + list.findMax());
	}

}

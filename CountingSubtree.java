package lesson3;
class CountingSubtree {

	static class node {
		int data;
		node left, right;
	};


	static class INT {
		int a;
	}

	static boolean inRange(node root, int low, int high)
	{
		return root.data >= low && root.data <= high;
	}

	static boolean getCountUtil(node root, int low,
								int high, INT count)
	{

		if (root == null)
			return true;


		boolean l = getCountUtil(root.left,
								low, high, count);
		boolean r = getCountUtil(root.right,
								low, high, count);


		if (l && r && inRange(root, low, high)) {
			++count.a;
			return true;
		}

		return false;
	}


	static INT getCount(node root, int low, int high)
	{
		INT count = new INT();
		count.a = 0;
		getCountUtil(root, low, high, count);
		return count;
	}


	static node newNode(int data)
	{
		node temp = new node();
		temp.data = data;
		temp.left = temp.right = null;
		return (temp);
	}


	public static void main(String args[])
	{

		node root = newNode(10);
		root.left = newNode(5);
		root.right = newNode(50);
		root.left.left = newNode(1);
		root.right.left = newNode(40);
		root.right.right = newNode(100);
		
		int l = 5;
		int h = 45;
		System.out.println("Count of subtrees in [" + l + ", "+ h + "] is " + getCount(root, l, h).a);
	}
}



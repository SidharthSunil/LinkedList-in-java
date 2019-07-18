package doublyLinkedList;

public class doublyLL {
	public class Linkedlist {
		Node head=null,curr,tail=null;
		int length;
		Node temp = new Node();
		
		void tailSet() {
			if(head==null)
				tail=null;
			curr=head;
			while(curr.next!=null)
				curr=curr.next;
			tail=curr;
		}
		
		void insert(int d)			//to insert at end of a linked list(i.e. at the end or tail)
		{
			temp.data = d;
			temp.next = null;
			if(head == null)
			{
				head = temp;
				tail = temp;
			}
			else
			{
				tail.next = temp;
				temp.prev = tail;
				tail = temp;
			}
		}

		void push(int d){			//to insert data at head or begenning of linked list
			temp.data = d;
			temp.prev=null;
			temp.next = head;
			head = temp;
		}
		void insertat(int ind,int d){		//to insert data 'd' at the 'ind'th position of linked list 
			temp.data = d;
			temp.next = null;

			curr = head;			//head is considered to be at the position 1(i.e. ind=1)
			for(int i=0;i<ind-1;i++)
				curr = curr.next;
				
			temp.next = curr.next;
			curr.next = temp;
		}
		int search(int key){			//to search if a given element is present in alinked list or not
			int pos =0;
			Node curr = head;
			while(curr!=null){
				if(curr.data==key)
					return pos;
				else {
					curr = curr.next;
					pos++;
			}
			}
			return -1;			//returns -1 if element is not present in linked list
	}
		void print()				//to print every element in linked list
		{
			curr = head;
			while(curr!=null)
			{
				System.out.printf("%d",curr.data);
				curr = curr.next;
				if(curr!=null)
					System.out.printf("->");
			}
		}
		void delete(int key){			//to delete the element key
			int pos;
			Node temp = new Node();
			pos = search(key);
			curr = head;
			if(pos>0){
			for (int k=0; k<pos-1 ; k++)
				curr = curr.next;
			temp = curr.next;
			curr.next = temp.next;
			temp = null;
			}
			else if(!(pos<0)){
				temp=head;
				head = head.next;
				temp.next=null;
			}
		}
		void middle(){				//to print the middle element
			Node middle = new Node();
			curr = head;
			middle = head;
			while(curr.next!=null){
				curr = curr.next;
				middle = middle.next;
				if(curr.next != null){
					curr = curr.next;
				}
			}
			System.out.println("Middle element "+ middle.data);
		}
		void count(){				//to print the number of elements in linked list
			curr =  head;
			while(curr.next!=null){
				length++;
			}
			System.out.println(length); 
		}
	}

}

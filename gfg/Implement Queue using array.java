class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	   if(rear==arr.length-1){
	    System.out.println("Queue is Full");
	   }
	   else if(front==-1 && rear==-1){
	       front=rear=0;
	   }
	   else{
	       rear++;
	       arr[rear]=x;
	   }
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	if(front==-1 && rear==-1){
	    return -1;
	}
	else if(rear==front){
	     front = rear=-1;
	     return -1;
	}
	else{
	    front++;
	    return arr[front];
	}

	} 
}

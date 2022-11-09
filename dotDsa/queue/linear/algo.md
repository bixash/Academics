


==== Algorithm for insertion an item in queue ====


Initialize front=0 and rear=-1
if rear>=MAXSIZE-1
print “queue overflow” and return
else
set rear=rear+1
queue[rear]=item
2. end


============== Deletion =========

Algorithm to delete an element from the queue:
1. if rear <front
print “queue is empty” and return
else
item=queue[front++]
2. end 

======= Definition ====
# define MAXQUEUE 50 
struct queue
{
int front;
int rear;
int items[MAXQUEUE];
};
typedef struct queue qt;



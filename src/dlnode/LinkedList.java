package dlnode;

public class LinkedList {
    static protected Node head;
    static protected int size;
    public static class Node{
        protected int data;
        protected Node prior;
        protected Node next;

        public Node(int data){
            this.data=data;
            this.prior=null;
            this.next=null;
        }
    }
    public LinkedList(){

    }

    public void add(int data){
        if(size==0){
            head=new Node(data);
            head.next=head;
            head.prior=head;
            size++;
        }else{
            Node newnode=new Node(data);
            Node oldtail=head.prior;
            oldtail.next=newnode;
            newnode.prior=oldtail;
            newnode.next=head;
            head.prior=newnode;
            size++;
        }
    }

    public void exchange(Node p){
        Node n1=p.prior;
        Node n2=n1.prior;
        Node n3=n2.prior;
        n3.next=n1;
        n1.prior=n3;
        n1.next=n2;
        n2.prior=n1;
        n2.next=p;
        p.prior=n2;
    }

     public void myprint(Node st){

        System.out.println(st.data);
        if(st.next!=this.head){
            myprint(st.next);
        }
     }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.exchange(l.head.next.next);
        l.myprint(l.head);
    }
}
